package com.qhit;

public class Trapezoid implements form {
	int up ;
	int below;
	int high;
	int tGirth;
	int waist;
	private int tAreas;
	
	//���췽��
	public Trapezoid(){
		System.out.println();
	}

	public Trapezoid(int up, int below) {
		
		this.up = up;
		this.below = below;
	}

	public int getAreas() {
		return tAreas;
	}
	
	
	
	//��д�ӿ���ķ���
	@Override
	public double perimeter() {
		tGirth =up+below+(waist*2);
		return tGirth;
	}

	@Override
	public double area() {
		tAreas =((up+below)*(high))/2;
		return getAreas();
	}
	
	
	
	
	
	
	
	
	
	
	
}
