package com.cnss.demo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import com.cnss.demo.utils.enumuration.Civilite;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

//	@Id
//	@Column(name="id")
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private Long id;
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "emp_name", length = 50, nullable = true)
    private String empName;

    @Column(name = "emp_designation", length = 50, nullable = true)
    @Size(min=2,max=10)
    private String empDesignation;

    @Column(name = "emp_salary", nullable = true)
    @Min(10)
    private Float empSalary;
    
    private String codePays;
    
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    @Temporal(TemporalType.DATE)
    @Past
    //@DateTimeFormat(iso=ISO.DATE)
    //@DateTimeFormat to format a java.util.Date as a ISO Date (yyyy-MM-dd):
    private Date dateNaissance;
 
    @Enumerated(EnumType.STRING)
    private Civilite civilite;
    
	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getCodePays() {
		return codePays;
	}

	public void setCodePays(String codePays) {
		this.codePays = codePays;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public Float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Float empSalary) {
        this.empSalary = empSalary;
    }

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
    
    
    

}
