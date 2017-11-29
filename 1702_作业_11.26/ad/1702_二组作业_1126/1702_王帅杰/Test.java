package com.qhit;

public class Test {
public static void main(String[] args) {
	System.out.println("--------------正方形");
	square s= new square();
	s.length=4.0;
	System.out.println("正方形的边长为："+s.length);
	System.out.println("正方形的面积为："+s.area());
	System.out.println("正方形的周长为："+s.perimeter());
	System.out.println("-------------------梯形");
	Trapezoid t =new Trapezoid();
	t.up=3;
	t.below=4;
	t.high=4;
	t.waist=5;
	System.out.println("梯形的上边长为："+t.up);
	System.out.println("梯形的下边长为："+t.below);
	System.out.println("梯形的高为："+t.high);
	System.out.println("梯形的腰为："+t.waist);
	System.out.println("梯形的面积为"+t.area());
	System.out.println("梯形的周长为"+t.perimeter());
	
	
	
	
	
}
}
