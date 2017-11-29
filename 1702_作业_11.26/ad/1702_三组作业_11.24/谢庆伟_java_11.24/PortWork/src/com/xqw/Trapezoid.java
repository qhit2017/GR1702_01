package com.xqw;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����4:48:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements IShape{

	private double uplen;  //�ϵ�
	private double downlen;  //�µ�
	private double high;  //��
	private double leftlen;  //����
	private double rightlen;  //����
	private double perimeter;  //�ܳ�
	private double area;  //���
	
	public Trapezoid() {
	}
	

	public Trapezoid(double uplen, double downlen) {
		this.uplen = uplen;
		this.downlen = downlen;
	}


	@Override
	public void GetPerimeter() {
		perimeter=uplen+downlen+leftlen+rightlen;
		System.out.println("�����ε��ܳ���"+perimeter);
		
	}

	@Override
	public void GetArea() {
		area=(uplen+downlen)*high/2;
		System.out.println("�����ε������"+area);
		
	}


	public double getHigh() {
		return high;
	}


	public void setHigh(double high) {
		this.high = high;
	}


	public double getLeftlen() {
		return leftlen;
	}


	public void setLeftlen(double leftlen) {
		this.leftlen = leftlen;
	}


	public double getRightlen() {
		return rightlen;
	}


	public void setRightlen(double rightlen) {
		this.rightlen = rightlen;
	}
	

}
