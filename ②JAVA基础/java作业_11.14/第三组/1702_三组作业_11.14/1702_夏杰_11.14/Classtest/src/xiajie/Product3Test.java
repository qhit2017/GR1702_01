package xiajie;

public class Product3Test {
	
	public static void main(String[] args) {
		//��Ʒ��š����ơ��۸��ͺš����
		Product3 p3 = new Product3("007","ƻ��",22.30,"A","�츻ʿ");
		
		p3.id = "007";
		p3.name = "ƻ��";
		p3.price = 22.30;
		p3.model = "A";
		p3.category = "�츻ʿ";
		
		System.out.println("��Ʒ��ţ�" + p3.id);
		System.out.println("��Ʒ���ƣ�" + p3.name);
		System.out.println("��Ʒ�۸�" + p3.price);
		System.out.println("��Ʒ�ͺţ�" + p3.model);
		System.out.println("��Ʒ���" + p3.category);
	}

}
