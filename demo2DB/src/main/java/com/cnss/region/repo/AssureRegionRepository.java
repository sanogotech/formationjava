package com.cnss.region.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnss.region.domain.AssureRegion;



@Repository
public interface AssureRegionRepository extends JpaRepository<AssureRegion, Long> {

  

}
