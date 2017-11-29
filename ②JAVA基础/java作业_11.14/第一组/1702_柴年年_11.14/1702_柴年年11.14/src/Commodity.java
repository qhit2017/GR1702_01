import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月13日 下午8:10:07
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Commodity {

	/*
	 * 创建管理员与商品类，并通过调用构造方法进行实例化 创建商品类，并给出商品编号、名称、价格、型号、类别五个属性，
	 * 并提供三个不同的构造方法：不带参数的，带编号、名称、价格三个参数的，带五个参数的构造方法； 分别调用三个构造方法实例化对象，并观察成员变量赋值情况
	 */
	// 带有三个参数的
	String number;
	String name;
	double price;
	String model;
	String category;

	Commodity(String number, String name, double price) {
		this.name = name;
		this.number = number;
		this.price = price;

	}

	// 带有五个参数的
	String number1;
	String name1;
	double price1;
	String model1;
	String category1;

	public Commodity(String number1, String name1, double price1,
			String model1, String category1) {
		this.number1 = number1;
		this.name1 = name1;
		this.price1 = price1;
		this.model1 = model1;
		this.category1 = category1;
	}

	// 不带参数的
	String number2;
	String name2;
	double price2;
	String model2;
	String category2;

	Commodity() {

	}
}
