package com.xqw;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����4:34:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements IShape{

	private double length;  //�߳�
	private double perimeter;  //�ܳ�
	private double area;  //���
	
	public Square() {
	}
	
	public Square(double length) {
		this.length = length;
	}

	@Override
	public void GetPerimeter() {
		perimeter=length*4;
		System.out.println("�߳�Ϊ"+length+"�������ε��ܳ���"+perimeter);
		
	}
	@Override
	public void GetArea() {
		area=Math.pow(length, 2);
		System.out.println("�߳�Ϊ"+length+"�������ε������"+area);
		
	}
	

}
