package com.zk.sjq;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月26日 下午5:47:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Square f = new Square();
		f.length = ("正方形的边长是"+4);
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
