
public class Trapezoid implements Shape {

	//���ԣ��ϱ߳����±߳����ߡ��ܳ������
	private double upside;
	private double downside;
	private double high;
	private double  perimeter;
	private double area;
	
	
	
	
	//����һ���޲εĹ��췽����
	public Trapezoid() {
		System.out.println("����Trapezoid���е��޲εĹ��췽����");
	}

	
	
	
	//����һ������Ϊ�ϱ߳����±߳��Ĺ��췽����

	public Trapezoid(double upside, double downside) {
		this.upside = upside;
		this.downside = downside;
	}

	
	
	
	//����set,get

	public double getUpside() {
		return upside;
	}


	public void setUpside(double upside) {
		this.upside = upside;
	}


	public double getDownside() {
		return downside;
	}


	public void setDownside(double downside) {
		this.downside = downside;
	}


	public double getHigh() {
		return high;
	}


	public void setHigh(double high) {
		this.high = high;
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
	public void perimeter() {
		System.out.println("�������ε��ܳ�����Ҳ�ܳ���");
		// TODO Auto-generated method stub

	}

	@Override
	public void area() {
		System.out.println("�������ε��������Ҳ�ܴ�");
		// TODO Auto-generated method stub

	}

}
