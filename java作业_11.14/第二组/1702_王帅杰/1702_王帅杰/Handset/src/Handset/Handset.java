package Handset;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��14�� ����5:41:47
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Handset {
	String type;// Ʒ��
	String memory;// �ڴ�
	String price;// �۸�

	Handset(String types, String memoryS, String priceS) {
		type = types;
		memory = memoryS;
		price = priceS;
	}

	public static void main(String[] args) {
		Handset s = new Handset("ƻ��", "64G", "7999");
		System.out.println("Ʒ�ƣ�" + s.type);
		System.out.println("�ڴ棺" + s.memory);
		System.out.println("�۸�:" + s.price);

	}
}
