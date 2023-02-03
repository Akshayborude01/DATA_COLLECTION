package com.spring.user.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EDUCATION_DETAILS")
public class EducationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer educationId;
	private String highestDegree;
	private Integer graduationYear;
	private String universityName;
    private Integer caseFk;
	/**
	 * @return the educationId
	 */
	public Integer getEducationId() {
		return educationId;
	}
	/**
	 * @param educationId the educationId to set
	 */
	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
	}
	/**
	 * @return the highestDegree
	 */
	public String getHighestDegree() {
		return highestDegree;
	}
	/**
	 * @param highestDegree the highestDegree to set
	 */
	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}
	/**
	 * @return the graduationYear
	 */
	public Integer getGraduationYear() {
		return graduationYear;
	}
	/**
	 * @param graduationYear the graduationYear to set
	 */
	public void setGraduationYear(Integer graduationYear) {
		this.graduationYear = graduationYear;
	}
	/**
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}
	/**
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
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
	public EducationDetails(Integer educationId, String highestDegree, Integer graduationYear, String universityName,
			Integer caseFk) {
		super();
		this.educationId = educationId;
		this.highestDegree = highestDegree;
		this.graduationYear = graduationYear;
		this.universityName = universityName;
		this.caseFk = caseFk;
	}
	@Override
	public String toString() {
		return "EducationDetails [educationId=" + educationId + ", highestDegree=" + highestDegree + ", graduationYear="
				+ graduationYear + ", universityName=" + universityName + ", caseFk=" + caseFk + "]";
	}
	public EducationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}
