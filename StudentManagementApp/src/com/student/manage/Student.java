package com.student.manage;

public class Student {
	
	private int Sid;
	private String Sname;
	private String Sphone;
	private String Scity;
	private int Sage;
	public Student(int sid, String sname, String sphone, String scity, int sage) {
		super();
		Sid = sid;
		Sname = sname;
		Sphone = sphone;
		Scity = scity;
		Sage = sage;
	}
	public Student(String sname, String sphone, String scity, int sage) {
		super();
		Sname = sname;
		Sphone = sphone;
		Scity = scity;
		Sage = sage;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSphone() {
		return Sphone;
	}
	public void setSphone(String sphone) {
		Sphone = sphone;
	}
	public String getScity() {
		return Scity;
	}
	public void setScity(String scity) {
		Scity = scity;
	}
	public int getSage() {
		return Sage;
	}
	public void setSage(int sage) {
		Sage = sage;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Sphone=" + Sphone + ", Scity=" + Scity + ", Sage=" + Sage
				+ "]";
	}

}
