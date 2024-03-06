package com.cisco.petsclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.petsclinic.model.Visit;
import com.cisco.petsclinic.repo.VisitRepository;

@Service
public class VisitServiceImpl implements VisitService{

	@Autowired
	private VisitRepository repository;

	@Override
	public List<Visit> getAllVisits() {
		return repository.findAll();
	}

	@Override
	public Visit getVisitById(Integer id) {
		return repository.getById(id);
	}

	@Override
	public Visit addVisit(Visit visit) {
		
		return repository.save(visit);
	}

	@Override
	public void deleteVisitById(Integer id) {
	
		repository.deleteById(id);
		
	}
	
	
} 