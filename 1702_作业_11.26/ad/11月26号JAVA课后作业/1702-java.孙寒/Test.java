
public class Test {
  //创建测试类，分别创建正方形和梯形的实例化对象，给对象的属性赋值，
	//并且调用对象的周长、面积的方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("正方形");
		Square square=new Square();
		Square square1=new Square();
		square.setSide(4);
		square.setPerimeter(16);
		square.setArea(16);
		System.out.println("边长:"+square.getSide());
		System.out.println("周长:"+square.getPerimeter());
		System.out.println("面积:"+square.getArea());
		
		System.out.println("梯形");
		Trapezoid trapezoid=new Trapezoid();
		Trapezoid trapezoid1=new Trapezoid();
		trapezoid.setUppercuplength(7);
		trapezoid.setHerelong(13);
		trapezoid.setArea(34);
		trapezoid.setPerimeter(70);
		trapezoid.setTall(7);
		System.out.println("上边长:"+trapezoid.getUppercuplength());
		System.out.println("下边长:"+trapezoid. getHerelong());
		System.out.println("高:"+trapezoid.getTall());
		System.out.println("周长:"+trapezoid.getPerimeter());
		System.out.println("面积:"+trapezoid.getArea());

	}

}
