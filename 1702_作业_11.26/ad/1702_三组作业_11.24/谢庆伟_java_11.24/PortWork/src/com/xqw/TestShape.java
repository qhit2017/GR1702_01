package com.xqw;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����4:58:39 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestShape {

	public static void testshape(IShape s){
		s.GetPerimeter();
		System.out.println();
		s.GetArea();
	}
	public static void main(String[] args) {
		Square s=new Square(2);
		Trapezoid t=new Trapezoid(4,7);
		t.setHigh(4);
		t.setLeftlen(4);
		t.setRightlen(5);
		testshape(s);
		System.out.println();
		testshape(t);

	}

}
