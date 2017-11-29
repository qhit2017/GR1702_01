package shap02;

public class Test {
	public static void main(String[] args) {
		// 正方形
		Square square1 = new Square();
		Square square2 = new Square(5);
		square2.getSide();
		square1.setPerimeter(20);
		square1.setArea(25);
		System.out.println("边长:" + square2.getSide() + "\n" + "周长:"
				+ square1.getPerimeter() + "\n" + "面积:" + square1.getArea());

		System.out.println();
		// 梯形
		Trapezoid trapezoid1 = new Trapezoid();
		Trapezoid trapezoid2 = new Trapezoid(2, 8);
		trapezoid2.getOntheside();
		trapezoid2.getHerelong();
		trapezoid1.setTell(4);
		trapezoid1.setArea(20);
		trapezoid1.setPerimeter(20);
		System.out.println("上边长:" + trapezoid2.getOntheside() + "\n" + "下边长:"
				+ trapezoid2.getHerelong() + "\n" + "高:" + trapezoid1.getTell()
				+ "\n" + "周长:" + trapezoid1.getPerimeter() + "\n" + "面积:"
				+ trapezoid1.getArea());
	}
}
