package com.zk.sjq;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��26�� ����5:47:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Square f = new Square();
		f.length = ("�����εı߳���"+4);
		System.out.println(f.length);
		System.out.println(f.perimeter());
		System.out.println(f.areas());
		System.out.println("\t");
		Trapezoid t = new Trapezoid();
		t.length1=3.0;
		t.length2=6.0;
		t.high=3.2;
		System.out.println(t.length1);
		System.out.println(t.length2);
		System.out.println(t.high);
		System.out.println(t.areas());
		System.out.println(t.perimeter());
	}

}
