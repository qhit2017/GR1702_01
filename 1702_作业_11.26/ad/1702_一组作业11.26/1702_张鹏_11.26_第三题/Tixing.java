package com.qhit;

public class Tixing implements Xingzhuang {

	double shangbianchang;
	double xiabiangchang;
	double zuobianchang;
	double youbianchang;
	double gao;
	double zhouchang;
	private double mianji;
	@Override
	public double getZhouchang() {
		// TODO Auto-generated method stub
		return shangbianchang+xiabiangchang+zuobianchang+youbianchang;
	}

	@Override
	public double getMianji() {
		// TODO Auto-generated method stub
		return (shangbianchang+xiabiangchang)*gao/2;
		
		
	}

	public Tixing() {
	}

	public Tixing(double shangbianchang, double xiabiangchang) {
		this.shangbianchang = shangbianchang;
		this.xiabiangchang = xiabiangchang;
	}

	
}
