import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��13�� ����8:10:07
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Commodity {

	/*
	 * ��������Ա����Ʒ�࣬��ͨ�����ù��췽������ʵ���� ������Ʒ�࣬��������Ʒ��š����ơ��۸��ͺš����������ԣ�
	 * ���ṩ������ͬ�Ĺ��췽�������������ģ�����š����ơ��۸����������ģ�����������Ĺ��췽���� �ֱ�����������췽��ʵ�������󣬲��۲��Ա������ֵ���
	 */
	// ��������������
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

	// �������������
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

	// ����������
	String number2;
	String name2;
	double price2;
	String model2;
	String category2;

	Commodity() {

	}
}
