package yangxueting;

public class Product {
	String name;
	int number;
	int price;
	String model;
	String category;
	
	//Ĭ�ϲ����������췽��
	public Product(){
		System.out.println("��������:");
	}
	//�����������Ĺ��췽��
	public Product(String nameA,int numberA,int priceA){
		name=nameA;
		number=numberA;
		price=priceA;
		System.out.println("����������:");
	}
	
	//�����в����Ĺ���
	Product(String nameB,int numberB,int priceB,String modelB,String categoryB){
		name=nameB;
		number=numberB;
		price=priceB;
		model=modelB;
		category=categoryB;
		System.out.println("���������:");
		
	}

}
