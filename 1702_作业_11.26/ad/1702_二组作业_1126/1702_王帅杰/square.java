package com.qhit;
	
public class square implements form {
	double length;
	double girth;
	private double areas;
	
	
	//���췽��
	public square(){
		System.out.println();
	}


	public double getLength() {
		return length;
	}

	public double getAreas() {
		return areas;
	}
	//��д�ӿ���ĳ��󷽷�


	@Override
	public double perimeter() {
		girth = length*4;
		return girth;
	}


	@Override
	public double area() {
		areas =length*length;
		return getAreas();
	}
	
	
	
}
