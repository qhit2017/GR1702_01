package com.qhit.wyk;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��24�� ����1:23:39 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements IForm{

	//.���������Σ�ʵ����״����ӿڡ�Ҫ�������ξ��е����԰������߳����ܳ������������˽�У� ��
	//���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�߳��Ĺ��췽����
	
	
	private double length;
	private double perimeter;
	private double area;
	
	
	@Override
	public String toString() {
		return "Square [length=" + length + "]";
	}


	public Square(double length) {
		this.length = length;
		
	}


	public Square() {
		// TODO Auto-generated constructor stub
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
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
