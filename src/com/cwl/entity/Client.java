package com.cwl.entity;

public class Client {
	String cid;
	String cname;
	String cpass;
	String ctel;
	String cmail;
	String caddr;
	String ccart;
	String corder;
	String a;
	String b;
	String c;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public String getCtel() {
		return ctel;
	}

	public void setCtel(String ctel) {
		this.ctel = ctel;
	}

	public String getCmail() {
		return cmail;
	}

	public void setCmail(String cmail) {
		this.cmail = cmail;
	}

	public String getCaddr() {
		return caddr;
	}

	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}

	public String getCcart() {
		return ccart;
	}

	public void setCcart(String ccart) {
		this.ccart = ccart;
	}

	public String getCorder() {
		return corder;
	}

	public void setCorder(String corder) {
		this.corder = corder;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Client [cid=" + cid + ", cname=" + cname + ", cpass=" + cpass + ", ctel=" + ctel + ", cmail=" + cmail
				+ ", caddr=" + caddr + ", ccart=" + ccart + ", corder=" + corder + ", a=" + a + ", b=" + b + ", c=" + c
				+ "]";
	}

	public Client(String cid, String cname, String cpass, String ctel, String cmail, String caddr, String ccart,
			String corder, String a, String b, String c) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cpass = cpass;
		this.ctel = ctel;
		this.cmail = cmail;
		this.caddr = caddr;
		this.ccart = ccart;
		this.corder = corder;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Client() {
		super();
	}

}
