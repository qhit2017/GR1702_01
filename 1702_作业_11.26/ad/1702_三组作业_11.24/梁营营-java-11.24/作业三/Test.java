
public class Test {

	 public static void main(String[] args) {
		//分别创建正方形和梯形的实例化对象，给对象的属性赋值，并且调用对象的周长、面积的方法
		 //创建正方形的实例化对象；
		 Square square = new Square();
		 square.setSide(4);
		 square.setPerimeter(16);
		 square.setArea(16);
		 System.out.println("边长："+square.getSide());
		 System.out.println("周长："+square.getPerimeter());
		 System.out.println("面积："+square.getArea());
		 square.perimeter();
		 square.area();
		 
		 //创建梯形的实例化对象；
		 Trapezoid trapezoid = new Trapezoid();
		 trapezoid.setUpside(6);
		 trapezoid.setDownside(12);
		 trapezoid.setHigh(8);
		 trapezoid.setPerimeter(32);
		 trapezoid.setArea(72);
		 System.out.println("上边长："+trapezoid.getUpside());
		 System.out.println("下边长："+trapezoid.getDownside());
		 System.out.println("高度："+trapezoid.getHigh());
		 System.out.println("周长："+trapezoid.getPerimeter());
		 System.out.println("面积："+trapezoid.getArea());
		 trapezoid.perimeter();
		 trapezoid.area();
	}
}
