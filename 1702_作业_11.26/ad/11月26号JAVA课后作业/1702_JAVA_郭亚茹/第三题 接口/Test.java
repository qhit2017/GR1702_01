package Com.qq;

public class Test {

	public static void main(String[] args) {
		// �����������࣬�ֱ𴴽������κ����ε�ʵ�������󣬸���������Ը�ֵ�����ҵ��ö�����ܳ�������ķ���
		Square square = new Square();
		square.setArea(5);
		square.setPermete(3);
		square.setSide(9);
		System.out.println("�ܳ���" + square.getPermete() + "\n" + "���"
				+ square.getArea());
		System.out.println(square.getPermete());
		System.out.println(square.getArea());
		System.out.println();
		Trapezoid trapezoid = new Trapezoid();
		System.out.println("�ܳ���" + trapezoid.getPermete() + "\n" + "���"
				+ trapezoid.getArea());
		System.out.println(trapezoid.getPermete() + "\n" + trapezoid.getArea());
		System.out.println();

	}

}
