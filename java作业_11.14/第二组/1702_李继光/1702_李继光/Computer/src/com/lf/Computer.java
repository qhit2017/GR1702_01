package com.lf;

public class Computer {
//������Ե�����
	String type;//Ʒ��
	String memory;//�ڴ�
	String price;//�۸�
	Computer(String typeS,String memoryS,
			String priceS){
		type   = typeS;
		memory = memoryS;
		price  = priceS;
		
	}
	public static void main(String[] args) {
		Computer s = new Computer("����","8G","1500");
			System.out.println("Ʒ�ƣ�"+s.type);
			System.out.println("�ڴ棺"+s.memory);
			System.out.println("�۸�"+s.price);
		
	}
}
