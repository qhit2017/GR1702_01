package com.qhit;

public class Trapezoid implements Form{
	
	/*c.�������Σ�ʵ����״����ӿڡ�Ҫ�����ξ��е����԰�����
    �ϱ��ϡ��±߳����ߡ��ܳ������������˽�У� �����������ֹ��췽��
    ��1 �޲ι��췽�� 2 ����Ϊ�ϱ߳����±߳��Ĺ��췽����
    */

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}  
	
	private double upside;//�ϱ߳�
	private double under;//�±߳�
	private double high;//��
	private double perimeter;//�ܳ�
	private double area;//���
	
	public Trapezoid() {
		
	}

	
	public Trapezoid(double upside, double under) {
		
		this.upside = upside;
		this.under = under;
	}

	public double getUpside() {
		return upside;
	}
	public void setUpside(double upside) {
		this.upside = upside;
	}

	public double getUnder() {
		return under;
	}
	public void setUnder(double under) {
		this.under = under;
	}

	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
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
