/*4  创建一个测试类，实例化一个警犬对象，
 * 设置警犬品种、毛的颜色、重量、年龄、眼
 * 睛颜色、腿的数量、最快时速，
 * 调用它的吃的方法和work方法
 */
//创建一个测试类
public class Test {
public static void main(String[] args) {
	Sleuth sleuth = new Sleuth("比特犬","黑色",2,20,"黄色",4,50);
	sleuth.setBreed("比特犬");
	System.out.println("警犬品种:"+sleuth.getBreed());
	sleuth.setColor("黑色");
	System.out.println("毛的颜色:"+sleuth.getColor());
	sleuth.setAge(2);
	System.out.println("年龄:"+sleuth.getAge()+"岁");
	sleuth.setWeight(20);
	System.out.println("重量:"+sleuth.getWeight()+"kg");
	sleuth.eyecolor="黄色";
	System.out.println("眼睛颜色:"+sleuth.eyecolor);
	sleuth.leg=4;
	System.out.println("腿的数量:"+sleuth.leg+"只");
	sleuth.speed=50;
	System.out.println("最快时速:"+sleuth.speed+"km/h");
	sleuth.eat();
	sleuth.work();
}
}
