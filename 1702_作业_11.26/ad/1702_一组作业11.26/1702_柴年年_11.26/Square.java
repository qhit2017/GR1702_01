
package com.Form;
/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��25�� ����1:26:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements Form {

	double side;
	double perimeter;
	private double area;
	
	Square() {
		System.out.println("����Square���޲ι��췽��");
	}
	
	public Square(double side) {
		this.side = side;
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
