package com.qhit;

public class Zhengfangxing implements Xingzhuang {

	double biangchang;
	double zhouchang;
	private double mianji;
	
	
	public void setMianji(double mianji) {
		this.mianji = mianji;
	}

	@Override
	public double getZhouchang() {
		// TODO Auto-generated method stub
		return biangchang*4;
	}

	@Override
	public double getMianji() {
		// TODO Auto-generated method stub
		return biangchang*biangchang;
	}

	public Zhengfangxing() {
	}

	public Zhengfangxing(double biangchang) {
		this.biangchang = biangchang;
	}

	
	
}
