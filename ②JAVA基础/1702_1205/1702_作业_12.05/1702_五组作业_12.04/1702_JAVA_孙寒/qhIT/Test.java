package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Contatc>arrayList=new ArrayList<Contatc>();
		Contatcs contatcs = new Contatcs(null, null, null);
		Scanner sc=new Scanner(System.in);
		
		contatcs .helpinfo();
		
		boolean isQuit=true;
		int key=0;
		
		while (isQuit) {
			
			key=sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("��������Ϣ");
				contatcs.addContatc(arrayList, sc);
				break;
			case 2:
				System.out.println("������鿴����Ϣ");
				contatcs.infoContatc(arrayList);
				break;
			case 3:
				System.out.println("���������ֲ�����Ϣ");
				String name = sc.next();
				contatcs.findByName(arrayList, name);
				break;
			case 4:
				System.out.println("�������Ա������Ϣ");
				String sex = sc.next();
			    contatcs.findBySex(arrayList, sex);
				break;
			case 5:
				System.out.println("��������������Ϣ");
				String num = sc.next();
			    contatcs.findByNum(arrayList, num);
				break;
			case 6:
				
				isQuit=false;
				break;
					

			default:
				break;
			}
		}
		System.out.println("�˳�");

	}

}
