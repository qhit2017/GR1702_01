package Definition;

import java.security.Policy;

/**
 * @author 作者 E-mail:1456014420@qq.com
 * @date 创建时间：2017年11月16日 上午8:34:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {
	public static void main(String[] args) {

		// 创建一个测试类，实例化一个警犬对象，
		// 设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速，
		// 调用它的吃的方法和work方法
		Dogs policdog = new Dogs("哈士奇", "黑白色", 9, 23.5, 4, "蓝色", "20公里");
		policdog.setBreed("哈士奇");
		System.out.println("种类" + policdog.getBreed());
		policdog.eyecolor = "黑白色";
		System.out.println("眼睛的颜色" + policdog.getColour());
		policdog.setWeight(12);
		System.out.println(policdog.getWeight());
		policdog.setAge(8);
		System.out.println(policdog.getAge());
		policdog.setColour("bule");
		System.out.println(policdog.getColour());
		policdog.number = 4;
		System.out.println(policdog.number);
		System.out.println(policdog.Speedperhour);
		policdog.eat();
		policdog.work();

	}
}