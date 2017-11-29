package Com.qq;

public class Test {

	public static void main(String[] args) {
		// 创建出测试类，分别创建正方形和梯形的实例化对象，给对象的属性赋值，并且调用对象的周长，面积的方法
		Square square = new Square();
		square.setArea(5);
		square.setPermete(3);
		square.setSide(9);
		System.out.println("周长：" + square.getPermete() + "\n" + "面积"
				+ square.getArea());
		System.out.println(square.getPermete());
		System.out.println(square.getArea());
		System.out.println();
		Trapezoid trapezoid = new Trapezoid();
		System.out.println("周长：" + trapezoid.getPermete() + "\n" + "面积"
				+ trapezoid.getArea());
		System.out.println(trapezoid.getPermete() + "\n" + trapezoid.getArea());
		System.out.println();

	}

}
