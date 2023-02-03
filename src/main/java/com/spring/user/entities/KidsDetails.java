package com.spring.user.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KIDS_DETAILS")
public class KidsDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer kidId;
	private String kidName;
	private Integer kidAge;
	private Integer kidSsn;
	private Integer caseFk;
	/**
	 * @return the kidId
	 */
	public Integer getKidId() {
		return kidId;
	}
	/**
	 * @param kidId the kidId to set
	 */
	public void setKidId(Integer kidId) {
		this.kidId = kidId;
	}
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
		return "KidsDetails [kidId=" + kidId + ", kidName=" + kidName + ", kidAge=" + kidAge + ", kidSsn=" + kidSsn
				+ ", caseFk=" + caseFk + "]";
	}
	public KidsDetails(Integer kidId, String kidName, Integer kidAge, Integer kidSsn, Integer caseFk) {
		super();
		this.kidId = kidId;
		this.kidName = kidName;
		this.kidAge = kidAge;
		this.kidSsn = kidSsn;
		this.caseFk = caseFk;
	}
	public KidsDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
   
}
