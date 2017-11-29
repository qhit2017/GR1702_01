package quiert;

/**
 * @author 作者: xuyunmeng
 * @date 创建时间：2017年11月14日 下午6:28:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Snack {
	// 小吃店

	String model;
	String name;
	double price;
	String category;
	int number;

	// 无参数的
	Snack() {

	}

	// 不带参数的，带编号、名称、价格三个参数

	public Snack(String model, String name, double price) {
		super();
		this.model = model;
		this.name = name;
		this.price = price;
		System.out.println("我是构造方法，我在构造一个对象");
	}

	// 五个参数的构造方法

	public Snack(String model, String name, double price, String category,
			int number) {
		super();
		this.model = model;
		this.name = name;
		this.price = price;
		this.category = category;
		this.number = number;
	}
}
