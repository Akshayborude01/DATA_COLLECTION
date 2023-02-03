package com.spring.user.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.user.bindings.EducationData;
import com.spring.user.bindings.IncomeData;
import com.spring.user.bindings.KidsData;
import com.spring.user.entities.EducationDetails;
import com.spring.user.entities.IncomeDetails;
import com.spring.user.entities.KidsDetails;
import com.spring.user.repositories.EducationRepository;
import com.spring.user.repositories.IncomeRepository;
import com.spring.user.repositories.KidsRepository;
import com.spring.user.repositories.PlanRepository;

@Service
public class ServiceImpl implements DataService {

	@Autowired
	private PlanRepository repository;
	
	@Autowired
	private IncomeRepository incomeRepository;
	
	@Autowired
	private EducationRepository educationRepository;
	
	@Autowired
	private KidsRepository kidsRepository;
	
	@Override
	public List<String> selectPlan() {
		List<String> planName = repository.getPlanName();
		return planName;
	}

	@Override
	public String saveIncome(IncomeData data) {
		
		IncomeDetails entity = new IncomeDetails();
		
		BeanUtils.copyProperties(data, entity);
		
		IncomeDetails save = incomeRepository.save(entity);
		
		return "Income Details Saved Successfully";
	}

	@Override
	public String saveEducation(EducationData data) {
		
		EducationDetails entity = new EducationDetails();
		
		BeanUtils.copyProperties(data, entity);
		
		EducationDetails save = educationRepository.save(entity);
		
		return "Education Details Saved Sucessfully";
	}

	

	@Override
	public String createCase(Integer id) {
		
		return null;
	}
	
	@Override
	public String saveKids(KidsData data) {
		
		KidsDetails entity = new KidsDetails();
		
		BeanUtils.copyProperties(data, entity);
		
		KidsDetails save = kidsRepository.save(entity);
		
		return "Kids Details Saved Sucessfully";
		
	}



}
