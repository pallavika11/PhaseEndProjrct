package com.cisco.petsclinic.service;

import java.util.List;

import com.cisco.petsclinic.model.Visit;

public interface VisitService {

	List<Visit> getAllVisits();
	Visit getVisitById(int id);
	void addVisit(Visit visit);
	void deleteVisitById(int id);
} 