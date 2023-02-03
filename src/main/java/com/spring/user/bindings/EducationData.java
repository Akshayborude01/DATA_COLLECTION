package com.spring.user.bindings;

public class EducationData {

	private String highestDegree;
	private Integer graduationYear;
	private String universityName;
    private Integer caseFk;
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
	@Override
	public String toString() {
		return "EducationData [highestDegree=" + highestDegree + ", graduationYear=" + graduationYear
				+ ", universityName=" + universityName + ", caseFk=" + caseFk + "]";
	}
	public EducationData(String highestDegree, Integer graduationYear, String universityName, Integer caseFk) {
		super();
		this.highestDegree = highestDegree;
		this.graduationYear = graduationYear;
		this.universityName = universityName;
		this.caseFk = caseFk;
	}
	public EducationData() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
