package com.spring.user.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INCOME_DETAILS")
public class IncomeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer incomeId;
	private Integer monthlyIncome;
	private Integer rentIncome;
	private Integer propertyIncome;
	private Integer caseFk;
	/**
	 * @return the incomeId
	 */
	public Integer getIncomeId() {
		return incomeId;
	}
	/**
	 * @param incomeId the incomeId to set
	 */
	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}
	/**
	 * @return the monthlyIncome
	 */
	public Integer getMonthlyIncome() {
		return monthlyIncome;
	}
	/**
	 * @param monthlyIncome the monthlyIncome to set
	 */
	public void setMonthlyIncome(Integer monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	/**
	 * @return the rentIncome
	 */
	public Integer getRentIncome() {
		return rentIncome;
	}
	/**
	 * @param rentIncome the rentIncome to set
	 */
	public void setRentIncome(Integer rentIncome) {
		this.rentIncome = rentIncome;
	}
	/**
	 * @return the propertyIncome
	 */
	public Integer getPropertyIncome() {
		return propertyIncome;
	}
	/**
	 * @param propertyIncome the propertyIncome to set
	 */
	public void setPropertyIncome(Integer propertyIncome) {
		this.propertyIncome = propertyIncome;
	}
	/**
	 * @return the caseFk
	 */
	public Integer getCaseFk() {
		return caseFk;
	}
	/**
	 * @param caseFk the caseFk to set
	 */
	public void setCaseFk(Integer caseFk) {
		this.caseFk = caseFk;
	}
	@Override
	public String toString() {
		return "IncomeDetails [incomeId=" + incomeId + ", monthlyIncome=" + monthlyIncome + ", rentIncome=" + rentIncome
				+ ", propertyIncome=" + propertyIncome + ", caseFk=" + caseFk + "]";
	}
	public IncomeDetails(Integer incomeId, Integer monthlyIncome, Integer rentIncome, Integer propertyIncome,
			Integer caseFk) {
		super();
		this.incomeId = incomeId;
		this.monthlyIncome = monthlyIncome;
		this.rentIncome = rentIncome;
		this.propertyIncome = propertyIncome;
		this.caseFk = caseFk;
	}
	public IncomeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
