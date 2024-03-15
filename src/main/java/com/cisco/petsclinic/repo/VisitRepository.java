package com.cisco.petsclinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cisco.petsclinic.model.Visit;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Integer>{

}
