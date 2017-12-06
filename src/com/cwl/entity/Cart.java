package com.cwl.entity;

public class Cart {
	int cfid;
	int ccount;
	String cname;
	
	public int getCfid() {
		return cfid;
	}
	public void setCfid(int cfid) {
		this.cfid = cfid;
	}
	public int getCcount() {
		return ccount;
	}
	public void setCcount(int ccount) {
		this.ccount = ccount;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Cart [ cfid=" + cfid + ", ccount=" + ccount + ", cname=" + cname + "]";
	}
	public Cart( int cfid, int ccount, String cname) {
		super();
		this.cfid = cfid;
		this.ccount = ccount;
		this.cname = cname;
	}
	public Cart() {
		super();
	}

	
}
