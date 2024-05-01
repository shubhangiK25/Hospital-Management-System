package com.Hospital.Management.System.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Management.System.entity.Patient;
import com.Hospital.Management.System.repository.PatientRepository;


@RestController
@RequestMapping("/api/patient")
public class PatientController {

	
	private PatientRepository patientRepository;

	public PatientController(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}
	@PostMapping("/insert")
	 public Patient createPatient(@RequestBody Patient patient)
	 {
		 return patientRepository.save(patient);
	 }
	
	
	@GetMapping("/get")
	 public List<Patient> getPatient()
	 {
		 return patientRepository.findAll();
	 }
	
	/**
	 @GetMapping("/get/{userid}")
	public Optional<Patient> getPatientById(@PathVariable Long userid)
	{
		return patientRepository.findById(userid);
		
	}
	 */
	
}
