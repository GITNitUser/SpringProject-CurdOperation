package com.optum.model;

public class Student {
	private String stdNo;
	private String stdName;
	private String stdAge;
	private String stdAadharNo;
	
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAge() {
		return stdAge;
	}
	public void setStdAge(String stdAge) {
		this.stdAge = stdAge;
	}
	public String getStdAadharNo() {
		return stdAadharNo;
	}
	public void setStdAadharNo(String stdAadharNo) {
		this.stdAadharNo = stdAadharNo;
	}
	@Override
	public String toString() {
		return "Student [stdNo=" + stdNo + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdAadharNo="
				+ stdAadharNo + "]";
	}

}
