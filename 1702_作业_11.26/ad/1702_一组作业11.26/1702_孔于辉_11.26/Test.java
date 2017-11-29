package com.kyh;

public class Test {
	public static void main(String[] args) {

		Square square = new Square(5);
		System.out.println("正方形周长：" + square.perimeter());
		System.out.println("正方形面积是：" + square.area());

		Trapezoid trapezoid = new Trapezoid(5, 6);
		trapezoid.left = 6;
		trapezoid.right = 4;
		trapezoid.high = 2;
		System.out.println("梯形周长：" + trapezoid.perimeter());
		System.out.println("梯形面积是：" + trapezoid.area());
	}
}
