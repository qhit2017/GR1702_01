package com.ai;

public class Square implements Form{

	double length;//�߳�
	double girth;//�ܳ�
	private double areas;//���
	//----------------------------------
	//���췽��
	
	public Square(){
		System.out.println();
	}
	public Square(double length) {
	this.length = length;
	}
	public double getAreas() {
		return areas;
	}
	//��д�ӿ���ĳ��󷽷�
	
	@Override
	public double perimeter() {
		girth=length*4;
		return girth;
	}
	@Override
	public double area() {
		areas=length*length;
		return getAreas();
	}

}
