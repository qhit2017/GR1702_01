package com.qk;
/**�����ߣ�������
 *����ʱ�䣺2017��11��26������8:42:10
 *���䣺2507147605@qq.com
 */
public class Trapezoid implements Form {
	 //�������Σ�ʵ����״����ӿڡ�Ҫ�����ξ��е����԰������ϱ��ϡ��±߳����ߡ��ܳ������������˽�У�
		//���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�ϱ߳����±߳��Ĺ��췽����
	private double Uppercuplength;
	private double Herelong;
	private double tall;
	private double perimeter;
	private double  area;
	
	public Trapezoid() {
		
	}
	
	public Trapezoid(double uppercuplength, double herelong) {
		super();
		Uppercuplength = uppercuplength;
		Herelong = herelong;
	}

	
	
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

	

	public double getUppercuplength() {
		return Uppercuplength;
	}

	public void setUppercuplength(double uppercuplength) {
		Uppercuplength = uppercuplength;
	}

	public double getHerelong() {
		return Herelong;
	}

	public void setHerelong(double herelong) {
		Herelong = herelong;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return "Trapezoid [Uppercuplength=" + Uppercuplength + ", Herelong="
				+ Herelong + ", tall=" + tall + ", perimeter=" + perimeter
				+ "]";
	}

}

