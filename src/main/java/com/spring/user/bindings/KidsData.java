package com.spring.user.bindings;

public class KidsData {

	private String kidName;
	private Integer kidAge;
	private Integer kidSsn;
	private Integer caseFk;
	/**
	 * @return the kidName
	 */
	public String getKidName() {
		return kidName;
	}
	/**
	 * @param kidName the kidName to set
	 */
	public void setKidName(String kidName) {
		this.kidName = kidName;
	}
	/**
	 * @return the kidAge
	 */
	public Integer getKidAge() {
		return kidAge;
	}
	/**
	 * @param kidAge the kidAge to set
	 */
	public void setKidAge(Integer kidAge) {
		this.kidAge = kidAge;
	}
	/**
	 * @return the kidSsn
	 */
	public Integer getKidSsn() {
		return kidSsn;
	}
	/**
	 * @param kidSsn the kidSsn to set
	 */
	public void setKidSsn(Integer kidSsn) {
		this.kidSsn = kidSsn;
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
		return "KidsData [kidName=" + kidName + ", kidAge=" + kidAge + ", kidSsn=" + kidSsn + ", caseFk=" + caseFk
				+ "]";
	}
	public KidsData(String kidName, Integer kidAge, Integer kidSsn, Integer caseFk) {
		super();
		this.kidName = kidName;
		this.kidAge = kidAge;
		this.kidSsn = kidSsn;
		this.caseFk = caseFk;
	}
	public KidsData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
