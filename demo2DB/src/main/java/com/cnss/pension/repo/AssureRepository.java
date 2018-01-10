package com.cnss.pension.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnss.pension.domain.Assure;

@Repository
public interface AssureRepository extends JpaRepository<Assure, Long> {



}
