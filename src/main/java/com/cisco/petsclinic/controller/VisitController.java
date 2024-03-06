package com.cisco.petsclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.petsclinic.model.Visit;
import com.cisco.petsclinic.service.VisitService;

@RestController
@RequestMapping("/api/petclinic")
public class VisitController {

	@Autowired
	private VisitService service;
	
	@GetMapping
	public ResponseEntity<List<Visit>> getAllVisits(){
		return new ResponseEntity<List<Visit>>(service.getAllVisits(),HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Object> getVisitById(@PathVariable Integer id){
		Visit foundVisit = service.getVisitById(id);
		if(foundVisit!=null)
			return new ResponseEntity<Object>(foundVisit,HttpStatus.OK);
		else 
			return new ResponseEntity<Object>("No Visit found with Id" +id,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	public ResponseEntity<Object> addVisit(@RequestBody Visit visit){
		Visit createdVisit = service.addVisit(visit);
		//(createdVisit!=null)
			return new ResponseEntity<Object>(createdVisit,HttpStatus.OK);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Object> deleteVisitById(@PathVariable Integer id){
		if(service.getVisitById(id)!=null) {
			service.deleteVisitById(id);
			return new ResponseEntity<Object>("Visit Deleted with Id "+id,HttpStatus.OK);
		}else
			return new ResponseEntity<Object>("No Visit found to delete with ID "+id,HttpStatus.NOT_FOUND);
	}
	
} 