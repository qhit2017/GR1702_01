/*1、创建管理员与商品类，并通过调用构造方法进行实例化 
创建商品类，并给出商品编号、名称、价格、型号、类别
五个属性，并提供三个不同的构造方法：不带参数的，带
编号、名称、价格三个参数的，带五个参数的构造方法；
分别调用三个构造方法实例化对象，并观察成员变量赋值情况；
*/
public class Shop {
	int id;                     //商品编号
	String name;                //商品名称
	double price;               //商品价格
	int model;                  //商品型号
	String category;            //商品类别
	public Shop(){              //不带参数的
		System.out.println("我是自动生成不带参数的");	
	}
	public Shop(int id, String name, double price, int model,
			String category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.model = model;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
}
