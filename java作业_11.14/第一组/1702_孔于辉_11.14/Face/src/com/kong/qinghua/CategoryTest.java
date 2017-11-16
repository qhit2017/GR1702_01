package com.kong.qinghua;

/**
 * @author 作者 E-mail:1299394372@qq.com
 * @date 创建时间：2017年11月14日 上午8:35:43
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class CategoryTest {
	// 不带参数的构造方法实例化对象，并观察成员变量赋值情况
	public static void main(String[] args) {

		Category p = new Category();

		System.out.println(p);
		System.out.println();

		// 带三个参数的构造方法,并观察成员变量赋值情况
		Category a = new Category("001", "汽车", 56666);

		System.out.println(a.getSerial());
		System.out.println(a.name);
		System.out.println(a.price);

		System.out.println();

		// 带五个参数的构造方法,并观察成员变量赋值情况
		Category s = new Category("001", "汽车", 56666, "奔驰", "交通工具");

		System.out.println(s.getSerial());
		System.out.println(s.name);
		System.out.println(s.price);
		System.out.println(s.model);
		System.out.println(s.category);

	}

}
