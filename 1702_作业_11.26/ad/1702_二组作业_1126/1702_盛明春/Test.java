package shap02;

public class Test {
	public static void main(String[] args) {
		// ������
		Square square1 = new Square();
		Square square2 = new Square(5);
		square2.getSide();
		square1.setPerimeter(20);
		square1.setArea(25);
		System.out.println("�߳�:" + square2.getSide() + "\n" + "�ܳ�:"
				+ square1.getPerimeter() + "\n" + "���:" + square1.getArea());

		System.out.println();
		// ����
		Trapezoid trapezoid1 = new Trapezoid();
		Trapezoid trapezoid2 = new Trapezoid(2, 8);
		trapezoid2.getOntheside();
		trapezoid2.getHerelong();
		trapezoid1.setTell(4);
		trapezoid1.setArea(20);
		trapezoid1.setPerimeter(20);
		System.out.println("�ϱ߳�:" + trapezoid2.getOntheside() + "\n" + "�±߳�:"
				+ trapezoid2.getHerelong() + "\n" + "��:" + trapezoid1.getTell()
				+ "\n" + "�ܳ�:" + trapezoid1.getPerimeter() + "\n" + "���:"
				+ trapezoid1.getArea());
	}
}
