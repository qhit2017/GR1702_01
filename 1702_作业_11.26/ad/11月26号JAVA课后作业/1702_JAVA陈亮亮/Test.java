package com.qk;
/**�����ߣ�������
 *����ʱ�䣺2017��11��26������8:45:39
 *���䣺2507147605@qq.com
 */
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������");
		Square square=new Square();
		Square square1=new Square();
		square.setSide(4);
		square.setPerimeter(16);
		square.setArea(16);
		System.out.println("�߳�:"+square.getSide());
		System.out.println("�ܳ�:"+square.getPerimeter());
		System.out.println("���:"+square.getArea());
		
		System.out.println("����");
		Trapezoid trapezoid=new Trapezoid();
		Trapezoid trapezoid1=new Trapezoid();
		trapezoid.setUppercuplength(7);
		trapezoid.setHerelong(13);
		trapezoid.setArea(34);
		trapezoid.setPerimeter(70);
		trapezoid.setTall(7);
		System.out.println("�ϱ߳�:"+trapezoid.getUppercuplength());
		System.out.println("�±߳�:"+trapezoid. getHerelong());
		System.out.println("��:"+trapezoid.getTall());
		System.out.println("�ܳ�:"+trapezoid.getPerimeter());
		System.out.println("���:"+trapezoid.getArea());

	}

}
