package com.optum.bo;

import java.io.Serializable;

public class StudentBO implements Serializable {
	private static final long serialVersionUID = -6646484214986277120L;
	private int stdNo;
	private String stdName;
	private int stdAge;
	private long stdAadharNo;

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public long getStdAadharNo() {
		return stdAadharNo;
	}

	public void setStdAadharNo(long stdAadharNo) {
		this.stdAadharNo = stdAadharNo;
	}

	@Override
	public String toString() {
		return "StudentBO [stdNo=" + stdNo + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdAadharNo="
				+ stdAadharNo + "]";
	}
}
