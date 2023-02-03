package com.spring.user.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAN_SELECTION")
public class PlanSelection {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String planName;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the planName
	 */
	public String getPlanName() {
		return planName;
	}
	/**
	 * @param planName the planName to set
	 */
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	@Override
	public String toString() {
		return "PlanSelection [id=" + id + ", planName=" + planName + "]";
	}
	public PlanSelection(Integer id, String planName) {
		super();
		this.id = id;
		this.planName = planName;
	}
	public PlanSelection() {
		super();
		// TODO Auto-generated constructor stub
	}


}
