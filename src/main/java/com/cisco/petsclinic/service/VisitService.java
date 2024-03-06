package com.cisco.petsclinic.service;

import java.util.List;

import com.cisco.petsclinic.model.Visit;

public interface VisitService {

	List<Visit> getAllVisits();
	Visit getVisitById(Integer id);
	Visit addVisit(Visit visit);
	void deleteVisitById(Integer id);
	
} 