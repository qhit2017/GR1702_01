package com.qk;
/**�����ߣ�������
 *����ʱ�䣺2017��11��26������8:37:21
 *���䣺2507147605@qq.com
 */
public class Square  implements Form{
	private static double side;
	private double perimeter;
	private double area;

	

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
    public Square() {
		
	}
    public Square(double side) {
		super();
		this.side = side;
	}
	
      //���������Σ�ʵ����״����ӿڡ�

	public static double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", perimeter="
				+ perimeter + ", area=" + area + "]";
	}

	public String getHerelong() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
