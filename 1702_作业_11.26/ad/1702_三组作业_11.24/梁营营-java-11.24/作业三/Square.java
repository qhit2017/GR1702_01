
public  class Square implements Shape {

	//���ԣ��߳����ܳ������
	private double side;
	private double perimeter;
	private double area;
	
	
	//����һ���޲εĹ��췽����
	public Square() {
		System.out.println("����Square���е��޲εĹ��췽����");
	}

	
	//��������Ϊ�߳��Ĺ��췽����
	public Square(double side) {
		this.side = side;
	}
	
	
	//����set,get
	public double getSide() {
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
	public void perimeter() {
		System.out.println("���������ε��ܳ����Һܳ���");
		// TODO Auto-generated method stub

	}

	@Override
	public void area() {
		System.out.println("���������ε�������Һܴ�");
		// TODO Auto-generated method stub

	}

}
