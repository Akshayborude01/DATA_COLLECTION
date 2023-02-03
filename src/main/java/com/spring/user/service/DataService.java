package com.spring.user.service;

import java.util.List;

import com.spring.user.bindings.EducationData;
import com.spring.user.bindings.IncomeData;
import com.spring.user.bindings.KidsData;

public interface DataService {
	
	public List<String> selectPlan();
	
	public String saveIncome(IncomeData data);
	
	public String saveEducation(EducationData data);
	
	public String saveKids(KidsData data);
	
	public String createCase(Integer id );
     
	
	
}
