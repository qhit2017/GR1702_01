package one;

/*制作人：王欣
 *制作时间：2017年11月13日下午9:27:49
 *邮箱：2408368509@qq.com
 */

public class Products {
	private String number;
	String name;
	int price;
	char model;
	String category;

	// 创建三个参数的构造方法
	public Products(String number, String name, int price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}

	{

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		if (number.equals("000")) {
			System.out.println("您输入的值无效");
		} else {
			this.number = number;
		}
	}
}
