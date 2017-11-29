package Class;

/*制作人：王欣
 *制作时间：2017年11月16日下午8:55:48
 *邮箱：2408368509@qq.com
 */

public class Test {
	public static void main(String[] args) {
		// 创建一个测试类，实例化一个警犬对象，
		// 设置警犬品种、毛的颜色、重量、
		// 年龄、眼睛颜色、腿的数量、最快时速，
		// 调用它的吃的方法和work方法
		PoliceDogs s = new PoliceDogs(4,"白","牧羊犬","黑色",5,"40千克",30 );
		System.out.println(s.color2);
		System.out.println(s.Fastestspeed);
		System.out.println(s.leg);
		System.out.println(s.getAge());
		s.eat();
		s.work();
	}

}
