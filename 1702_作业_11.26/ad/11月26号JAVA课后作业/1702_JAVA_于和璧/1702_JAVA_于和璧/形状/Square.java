package com.qhit;

public class Square implements Form {
	
	//b.���������Σ�ʵ����״����ӿڡ�Ҫ�������ξ��е����԰������߳����ܳ������������˽�У� ��
    //���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�߳��Ĺ��췽����

	
	private double  side;//�߳�
	private double  perimeter;//�ܳ�
	private double  area;//���
	
	
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public Square() {
		
	}

	
	public Square(double side) {
		
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}

	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
	
	
	

}
