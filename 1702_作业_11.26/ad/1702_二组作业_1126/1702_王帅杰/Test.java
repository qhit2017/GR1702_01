package com.qhit;

public class Test {
public static void main(String[] args) {
	System.out.println("--------------������");
	square s= new square();
	s.length=4.0;
	System.out.println("�����εı߳�Ϊ��"+s.length);
	System.out.println("�����ε����Ϊ��"+s.area());
	System.out.println("�����ε��ܳ�Ϊ��"+s.perimeter());
	System.out.println("-------------------����");
	Trapezoid t =new Trapezoid();
	t.up=3;
	t.below=4;
	t.high=4;
	t.waist=5;
	System.out.println("���ε��ϱ߳�Ϊ��"+t.up);
	System.out.println("���ε��±߳�Ϊ��"+t.below);
	System.out.println("���εĸ�Ϊ��"+t.high);
	System.out.println("���ε���Ϊ��"+t.waist);
	System.out.println("���ε����Ϊ"+t.area());
	System.out.println("���ε��ܳ�Ϊ"+t.perimeter());
	
	
	
	
	
}
}
