package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Receive w = new Receive();
		
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
		
		Scanner sc = new Scanner(System.in);
		
		w.help();
		
		boolean isQuit = true;
		while (isQuit) {
			
			System.out.println("������������س�����");
			
			String r = sc.next();
			switch (r) {
			case "1":
				System.out.println("��������Ʒ��Ϣ����ʽ���£�");
				System.out.println("001,ϴ��Һ,15.2,5");
				w.addcommodity(arrayList, sc);
				
				break;
			case "2":
				
				w.stockcommodity(arrayList, sc);
				break;
			case "3":
				
				w.removecommodity(arrayList, sc);
				break;
			case "4":
				
				w.infocommodity(arrayList);
				
				break;
			case "5":
				
				isQuit = false;
				
				break;

			default:
				break;
			}
			
		}
		
		System.out.println("���˳�����");
	}

}
