package com.cnss.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnss.demo.domain.Pays;

public interface PaysRepository extends JpaRepository<Pays, String> {

}
