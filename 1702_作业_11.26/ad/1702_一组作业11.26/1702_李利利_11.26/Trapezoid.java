public class Trapezoid implements Ishape {
	double above;
	double down;
	double left;
	double right;
	double high;
	double perimeter;
	private double area;

	// �޲ι��췽��
	public Trapezoid() {
		System.out.println("�������ε��޲ι��췽��");
	}

	// ����Ϊ�ϱ߳����±߳��Ĺ��췽��
	public Trapezoid(double above, double down) {
		this.above = above;
		this.down = down;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return above + down + left + right;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (above + down) * high / 2;
	}

}
