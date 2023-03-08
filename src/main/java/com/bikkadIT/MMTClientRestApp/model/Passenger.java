package com.bikkadIT.MMTClientRestApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	private int pid;

	private String fname;

	private String lname;

	private String f;

	private String t;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", fname=" + fname + ", lname=" + lname + ", f=" + f + ", t=" + t + "]";
	}

}
