package quiert;

/**
 * @author ����: xuyunmeng
 * @date ����ʱ�䣺2017��11��14�� ����6:28:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Snack {
	// С�Ե�

	String model;
	String name;
	double price;
	String category;
	int number;

	// �޲�����
	Snack() {

	}

	// ���������ģ�����š����ơ��۸���������

	public Snack(String model, String name, double price) {
		super();
		this.model = model;
		this.name = name;
		this.price = price;
		System.out.println("���ǹ��췽�������ڹ���һ������");
	}

	// ��������Ĺ��췽��

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
