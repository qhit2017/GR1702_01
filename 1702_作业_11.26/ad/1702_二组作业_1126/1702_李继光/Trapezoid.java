package com.ai;

public class Trapezoid implements Form{
	int up;//�ϱ߳�
	int below;//�±߳�
	int high;//��
	int tGirth;//�ܳ�
	int waist;//��
	private int tAreas;//���
	
	//���췽��
	public Trapezoid(){
		System.out.println();
	}
	
	public Trapezoid(int up, int below) {
		this.up = up;
		this.below = below;
	}
	public double gettAreas() {
		return tAreas;
	}
	//��д�ӿ���ĳ��󷽷�
	@Override
	public double perimeter() {
		tGirth = up+below+(waist*2);
		return tGirth;
	}

	@Override
	public double area() {
		tAreas = ((up+below)*high)/2;
		return  gettAreas();
	}

}
