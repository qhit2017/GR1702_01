package one;

/*�����ˣ�����
 *����ʱ�䣺2017��11��13������9:27:49
 *���䣺2408368509@qq.com
 */

public class Products {
	private String number;
	String name;
	int price;
	char model;
	String category;

	// �������������Ĺ��췽��
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
			System.out.println("�������ֵ��Ч");
		} else {
			this.number = number;
		}
	}
}
