package com.Hospital.Management.System.doclogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Management.System.doclogin.entity.Medicine;
import com.Hospital.Management.System.doclogin.repository.MedicineRepository;

@RestController
@RequestMapping("api/medicine")
public class MedicineController {
	
	@Autowired
	MedicineRepository medicineRepository;
	
	@PostMapping("/insert")
	public Medicine createMedicine( @RequestBody Medicine medicine) {
		return medicineRepository.save(medicine);
		
	}
	
	@GetMapping("/get")
	public List<Medicine> getMedicine()
	{
		return medicineRepository.findAll();
	}

}
