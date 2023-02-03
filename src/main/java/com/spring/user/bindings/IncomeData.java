package com.spring.user.bindings;

public class IncomeData {

	private Integer monthlyIncome;
	private Integer rentIncome;
	private Integer propertyIncome;
	private Integer caseFk;
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
		return "IncomeData [monthlyIncome=" + monthlyIncome + ", rentIncome=" + rentIncome + ", propertyIncome="
				+ propertyIncome + ", caseFk=" + caseFk + "]";
	}
	public IncomeData(Integer monthlyIncome, Integer rentIncome, Integer propertyIncome, Integer caseFk) {
		super();
		this.monthlyIncome = monthlyIncome;
		this.rentIncome = rentIncome;
		this.propertyIncome = propertyIncome;
		this.caseFk = caseFk;
	}
	public IncomeData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
