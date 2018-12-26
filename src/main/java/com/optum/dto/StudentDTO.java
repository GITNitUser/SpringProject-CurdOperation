package com.optum.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	private static final long serialVersionUID = -6446292370390639854L;
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
