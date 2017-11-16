package Car;

/**
 * @author 作者 E-mail:李永立271406@163.com
 * @date 创建时间：2017年11月14日 下午8:40:48
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Car {
	String color;
	int wheelNumber;
	float price;
	String weight;

	 Car(String color, int wheelNumber, float price, String weight) {
		this.color = color;
		this.wheelNumber =wheelNumber;
		this.price =price;
		this.weight=weight;
		System.out.println("我是小汽车，下面是我的介绍：");

	
	}

}

