package com.bean;

public class HrBean {

	private Integer hrid;
	private String name;
	private String email;
	private String password;
	private String mobileNo;

	public Integer getHrid() {
		return hrid;
	}

	public void setHrid(Integer hrid) {
		this.hrid = hrid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
