package com.demo.dto;

public class Contact {
	private String mobileNo;
	private String emailId;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String toString() {
		return this.emailId+" "+this.mobileNo;
	}

	
}
