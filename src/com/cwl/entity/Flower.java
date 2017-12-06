package com.cwl.entity;

public class Flower {
	int fid;
	String fname;
	String fprice;
	int ftid;
	String fgroup;
	String fcolor;
	String fstyle;
	String fnote;
	int fnum;
	String fbrand;
	Type ftype;
	String fimgs;
	String fimg1;
	String fimg2;
	String fimg3;
	String fimg4;
	String fimg5;
	String fa;
	String fb;
	String fc;
	String fd;
	String fe;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFprice() {
		return fprice;
	}
	public Type getFtype() {
		return ftype;
	}

	public void setFtype(Type ftype) {
		this.ftype = ftype;
	}

	

	public void setFprice(String fprice) {
		this.fprice = fprice;
	}

	public int getFtid() {
		return ftid;
	}

	public void setFtid(int ftid) {
		this.ftid = ftid;
	}

	public String getFgroup() {
		return fgroup;
	}

	public void setFgroup(String fgroup) {
		this.fgroup = fgroup;
	}

	public String getFcolor() {
		return fcolor;
	}

	public void setFcolor(String fcolor) {
		this.fcolor = fcolor;
	}

	public String getFstyle() {
		return fstyle;
	}

	public void setFstyle(String fstyle) {
		this.fstyle = fstyle;
	}

	public String getFnote() {
		return fnote;
	}

	public void setFnote(String fnote) {
		this.fnote = fnote;
	}

	public int getFnum() {
		return fnum;
	}

	public void setFnum(int fnum) {
		this.fnum = fnum;
	}

	public String getFbrand() {
		return fbrand;
	}

	public void setFbrand(String fbrand) {
		this.fbrand = fbrand;
	}

	public String getFimgs() {
		return fimgs;
	}

	public void setFimgs(String fimgs) {
		this.fimgs = fimgs;
	}

	public String getFimg1() {
		return fimg1;
	}

	public void setFimg1(String fimg1) {
		this.fimg1 = fimg1;
	}

	public String getFimg2() {
		return fimg2;
	}

	public void setFimg2(String fimg2) {
		this.fimg2 = fimg2;
	}

	public String getFimg3() {
		return fimg3;
	}

	public void setFimg3(String fimg3) {
		this.fimg3 = fimg3;
	}

	public String getFimg4() {
		return fimg4;
	}

	public void setFimg4(String fimg4) {
		this.fimg4 = fimg4;
	}

	public String getFimg5() {
		return fimg5;
	}

	public void setFimg5(String fimg5) {
		this.fimg5 = fimg5;
	}

	public String getFa() {
		return fa;
	}

	public void setFa(String fa) {
		this.fa = fa;
	}

	public String getFb() {
		return fb;
	}

	public void setFb(String fb) {
		this.fb = fb;
	}

	public String getFc() {
		return fc;
	}

	public void setFc(String fc) {
		this.fc = fc;
	}

	public String getFd() {
		return fd;
	}

	public void setFd(String fd) {
		this.fd = fd;
	}

	public String getFe() {
		return fe;
	}

	public void setFe(String fe) {
		this.fe = fe;
	}

	@Override
	public String toString() {
		return "flower [fid=" + fid + ", fname=" + fname + ", fprice=" + fprice + ", ftid=" + ftid + ", fgroup="
				+ fgroup + ", fcolor=" + fcolor + ", fstyle=" + fstyle + ",ftype="+ftype+", fnote=" + fnote + ", fnum=" + fnum
				+ ", fbrand=" + fbrand + ", fimgs=" + fimgs + ", fimg1=" + fimg1 + ", fimg2=" + fimg2 + ", fimg3="
				+ fimg3 + ", fimg4=" + fimg4 + ", fimg5=" + fimg5 + ", fa=" + fa + ", fb=" + fb + ", fc=" + fc + ", fd="
				+ fd + ", fe=" + fe + "]";
	}

	public Flower(int fid, String fname, String fprice, int ftid, String fgroup, String fcolor, String fstyle,
			String fnote, int fnum, Type ftype,String fbrand, String fimgs, String fimg1, String fimg2, String fimg3, String fimg4,
			String fimg5, String fa, String fb, String fc, String fd, String fe) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
		this.ftid = ftid;
		this.fgroup = fgroup;
		this.fcolor = fcolor;
		this.fstyle = fstyle;
		this.fnote = fnote;
		this.fnum = fnum;
		this.fbrand = fbrand;
		this.ftype=ftype;
		this.fimgs = fimgs;
		this.fimg1 = fimg1;
		this.fimg2 = fimg2;
		this.fimg3 = fimg3;
		this.fimg4 = fimg4;
		this.fimg5 = fimg5;
		this.fa = fa;
		this.fb = fb;
		this.fc = fc;
		this.fd = fd;
		this.fe = fe;
	}

	public Flower() {
		super();
	}

}
