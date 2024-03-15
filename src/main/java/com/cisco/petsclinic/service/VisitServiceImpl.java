package com.cisco.petsclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.petsclinic.model.Visit;
import com.cisco.petsclinic.repo.VisitRepository;

@Service
public class VisitServiceImpl implements VisitService{

	@Autowired
    private VisitRepository visitRepository;

	@Override
	public List<Visit> getAllVisits() {
		return visitRepository.findAll();
	}

	@Override
	public Visit getVisitById(int id) {
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public void addVisit(Visit visit) {
		 visitRepository.save(visit);
		
	}

	@Override
	public void deleteVisitById(int id) {
		 visitRepository.deleteById(id);
		
	}
	
	
	
	
} 