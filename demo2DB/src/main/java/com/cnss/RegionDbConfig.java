package com.cnss;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "regionEntityManagerFactory",
    transactionManagerRef = "regionTransactionManager", basePackages = {"com.cnss.region.repo"})
public class RegionDbConfig {
	
	@Bean(name = "regionJPA")
	@ConfigurationProperties("region.datasource.jpa")
	public JpaProperties customerJpaProperties() {
		return new JpaProperties();
	}

  @Bean(name = "regionDataSource")
  @ConfigurationProperties(prefix = "region.datasource")
  public DataSource dataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean(name = "regionEntityManagerFactory")
  public LocalContainerEntityManagerFactoryBean regionEntityManagerFactory(
      EntityManagerFactoryBuilder builder, @Qualifier("regionDataSource") DataSource dataSource) {
    return builder.dataSource(dataSource).packages("com.cnss.region.domain").persistenceUnit("region")
        .build();
  }

  @Bean(name = "regionTransactionManager")
  public PlatformTransactionManager regionTransactionManager(
      @Qualifier("regionEntityManagerFactory") EntityManagerFactory regionEntityManagerFactory) {
    return new JpaTransactionManager(regionEntityManagerFactory);
  }
  
  @Bean(name = "jdbcRegion") 
  public JdbcTemplate jdbcTemplate(DataSource regionDataSource) { 
      return new JdbcTemplate(regionDataSource); 
  } 

}
