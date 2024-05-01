package com.Hospital.Management.System.doclogin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Hospital.Management.System.doclogin.entity.Appointment;
import com.Hospital.Management.System.doclogin.repository.AppointmentsRepository;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
	
	AppointmentsRepository appointmentsRepository;

	public AppointmentController(AppointmentsRepository appointmentsRepository) {
		super();
		this.appointmentsRepository = appointmentsRepository;
	}
	
	   @PostMapping("/insert")
	   public Appointment createAppointment(@RequestBody  Appointment appointment) {
		   return appointmentsRepository.save(appointment);
	}
	   
	   @GetMapping("/get")
	     public List<Appointment> getAppointment()
	     {
	    	 return appointmentsRepository.findAll();
	     }
	     
	   
}
