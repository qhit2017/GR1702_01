package com.zk.sjq;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��26�� ����5:39:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements Form{
	double length1;
	double length2;
	double high;
	int  perimeter;
	private String areas;
	


	public String getAreas() {
		return areas;
	}

	@Override
	public int perimeter() {
		System.out.println("�����ܳ���");
		return 25;
	}

	@Override
	public String areas() {
		System.out.println("���������");
		return "24";
	}
	
}
