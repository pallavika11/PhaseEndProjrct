package com.cisco.petsclinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.petsclinic.model.Visit;

public interface VisitRepository extends JpaRepository<Visit,Integer>{

}
