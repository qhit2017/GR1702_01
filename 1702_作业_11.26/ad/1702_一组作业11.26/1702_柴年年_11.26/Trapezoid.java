
package com.Form;
/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��25�� ����1:35:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements Form {
	
	double left;
	double right;
	double upside;
	double under;
	double height;
	double perimeter;
	private double area;
	
	Trapezoid(){
		System.out.println("����Trapezoid���޲ι��췽��");
	}
	
	public Trapezoid(double upside, double under) {
		this.upside = upside;
		this.under = under;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return upside+under+left+right;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((upside+under)*height)/2;
	}

}
