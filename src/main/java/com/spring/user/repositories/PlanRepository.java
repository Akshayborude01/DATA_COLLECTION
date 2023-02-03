package com.spring.user.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.user.entities.PlanSelection;

public interface PlanRepository extends JpaRepository<PlanSelection, Serializable> {

	@Query("select distinct (planName) from PLAN_SELECTION")
	public  List<String> getPlanName();
}
