
package com.Form;
/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��25�� ����3:08:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		Square square = new Square(2.5);
		System.out.println("�������ܳ�:"+square.getPerimeter());
		System.out.println("���������:"+square.getArea());
		Trapezoid zoid = new Trapezoid(3,4);
		zoid.height=1.5;
		zoid.left=1.5;
		zoid.right=2.3;
		System.out.println("���ε��ܳ�"+zoid.getPerimeter());
		System.out.println("���ε����"+zoid.getArea());
	}
}
