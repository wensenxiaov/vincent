package com.cwl.entity;

import java.util.Date;

public class Order {

	int odid;
	String oname;
	String otel;
	String oaddr;
	String ocode;
	int oid;
	String omood;
	double oprice;
	String odate;
	String orname;

	public int getOdid() {
		return odid;
	}

	public void setOdid(int odid) {
		this.odid = odid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getOtel() {
		return otel;
	}

	public void setOtel(String otel) {
		this.otel = otel;
	}

	public String getOaddr() {
		return oaddr;
	}

	public void setOaddr(String oaddr) {
		this.oaddr = oaddr;
	}

	public String getOcode() {
		return ocode;
	}

	public void setOcode(String ocode) {
		this.ocode = ocode;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOmood() {
		return omood;
	}

	public void setOmood(String omood) {
		this.omood = omood;
	}

	public double getOprice() {
		return oprice;
	}

	public void setOprice(double oprice) {
		this.oprice = oprice;
	}

	public String getOdate() {
		return odate;
	}

	public void setOdate(String odate) {
		this.odate = odate;
	}

	public String getOrname() {
		return orname;
	}

	public void setOrname(String orname) {
		this.orname = orname;
	}

	@Override
	public String toString() {
		return "order [ odid="+odid+", oname=" + oname + ", otel=" + otel + ", oaddr=" + oaddr + ", ocode=" + ocode
				+ ", oid=" + oid + ", omood=" + omood + ", oprice=" + oprice + ", odate=" + odate + ", orname=" + orname + "]";
	}

	public Order(Integer odid, String oname, String otel, String oaddr, String ocode, int oid, String omood, double oprice,
			String odate, String orname) {
		super();
		this.odid=odid;
		this.oname = oname;
		this.otel = otel;
		this.oaddr = oaddr;
		this.ocode = ocode;
		this.oid = oid;
		this.omood = omood;
		this.oprice = oprice;
		this.odate = odate;
		this.orname = orname;
	}

	public Order() {
		super();
	}

}
