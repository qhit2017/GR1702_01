package zk.store.com;

import java.util.ArrayList;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		ArrayList<Store> arrayList = new ArrayList<Store>();
		Scanner sc = new Scanner(System.in);
		Shop c = new Shop();
		boolean f = true;
		int p;
		
		while (f) {
			
		p=sc.nextInt();
		switch (p) {
		case 1:
			System.out.println("��������Ҫ��ѯ����Ʒ���");
			c.addStore(arrayList, sc);
			break;
		case 2:
			System.out.println("��������Ҫ��ѯ������");
			c.addStore(arrayList, sc);
			break;

		case 3:
			System.out.println("��������Ҫ��ѯ�ļ۸�");
			c.addStore(arrayList, sc);
			break;

		case 4:
			System.out.println("��������Ҫ��ѯ������");
			c.addStore(arrayList, sc);
			break;

		case 5:
			f= false;
			break;


		default:
			break;
		}
		System.out.println("�ټ�");	
			
		
		
		}	
			
		
	}

}
