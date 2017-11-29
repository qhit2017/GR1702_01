package com.qhit.wyk;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��24�� ����1:28:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements IForm{

	//�������Σ�ʵ����״����ӿڡ�Ҫ�����ξ��е����԰������ϱ��ϡ��±߳����ߡ��ܳ������������˽�У� ��
	//���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�ϱ߳����±߳��Ĺ��췽����
	private double UpperCupLength;
	private double HereLong;
	private double tall;
	private double perimeter;
	private double area;
	public Trapezoid() {
		
	}
	
	@Override
	public String toString() {
		return "Trapezoid []";
	}


	public Trapezoid(double upperCupLength, double hereLong) {
		UpperCupLength = upperCupLength;
		HereLong = hereLong;
	}


	public double getUpperCupLength() {
		return UpperCupLength;
	}


	public void setUpperCupLength(double upperCupLength) {
		UpperCupLength = upperCupLength;
	}


	public double getHereLong() {
		return HereLong;
	}


	public void setHereLong(double hereLong) {
		HereLong = hereLong;
	}


	public double getTall() {
		return tall;
	}


	public void setTall(double tall) {
		this.tall = tall;
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
