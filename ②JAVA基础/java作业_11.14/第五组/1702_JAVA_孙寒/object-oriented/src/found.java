public class found {

	int number;// ��Ʒ���
	String name;// ����
	int  price;// �۸�
	char model;// �ͺ�
	int category;// ���

	found() {
		System.out.println("�����εģ�");
	}

	found(int numberA, String nameA, int d) {
		System.out.println("�������εģ�");

		number = numberA;
		name = nameA;
		price = d;

	}

	found(int numberS, String nameS, int priceS, char modelS, int categoryS) {
		System.out.println("������ε�:");
		number = numberS;
		name = nameS;
		price = priceS;
		model = modelS;
		category = categoryS;
	}

}
