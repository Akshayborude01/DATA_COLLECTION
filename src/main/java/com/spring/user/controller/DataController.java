package com.spring.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.user.bindings.EducationData;
import com.spring.user.bindings.IncomeData;
import com.spring.user.bindings.KidsData;
import com.spring.user.service.DataService;

@RestController
public class DataController {

	@Autowired
	private DataService service;

	@GetMapping("/selectplan")
	public List<String> selectPlan() {
		List<String> plan = service.selectPlan();
		return plan;
	}

	@PostMapping("/income")
	public ResponseEntity<String> saveIncome(@RequestBody IncomeData data) {

		String income = service.saveIncome(data);

		return new ResponseEntity<>(income, HttpStatus.OK);
	}

	@PostMapping("/education")
	public ResponseEntity<String> saveEducation(@RequestBody EducationData data) {

		String education = service.saveEducation(data);

		return new ResponseEntity<>(education, HttpStatus.OK);
	}

	@PostMapping("/kid")
	public ResponseEntity<String> saveKid(@RequestBody KidsData data) {

		String kids = service.saveKids(data);

		return new ResponseEntity<>(kids, HttpStatus.OK);
	}

	@GetMapping("/createcase/{id}")
	public String createcase(@PathVariable Integer id) {

		String case1 = service.createCase(id);

		return case1;
	}
}
