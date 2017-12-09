package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class Receive implements IMethod {

	@Override
	public void help() {
		System.out.println("----------������ϵͳ����----------");
		System.out.println("��1��������Ʒ������1");
		System.out.println("��2������������2");
		System.out.println("��3������������3");
		System.out.println("��4���ο����������4");
		System.out.println("��5���˳�������5");

	}

	@Override
	public void addcommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String a = sc.next();
		
		String[] arrs = a.split(",");
		
		if (arrs.length!=4) {
			
			System.out.println("������ĸ�ʽ����ȷ�����������룡 ");
		} else {
			
			Commodity q = new Commodity(arrs[0], arrs[1], Double.parseDouble(arrs[2]), Integer.parseInt(arrs[3]));
			
			arrayList.add(q);
			
			System.out.println(q.toString());

		}
		

	}
	
	@Override
	public void stockcommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		
		System.out.println("��������Ʒ���");
		 String number = sc.next();
		 boolean isnumber = false;
		 for (int i = 0; i < arrayList.size(); i++) {
			 
			 String number2 = arrayList.get(i).getNumber();
			 
			 if(number.equals(number2)){
				 System.out.println("�������������");
				 int r = sc.nextInt();
				 
				arrayList.get(i).setQuantity(arrayList.get(i).getQuantity()+r);
				 
				System.out.println("�����������Ϊ:"+arrayList.get(i).getQuantity());
				
				System.out.println(	arrayList.get(i).toString());
				
				 isnumber = true;
			 }
			 

			
		}
		 if (!isnumber) {
				
			 System.out.println("�Ҳ����˱����Ʒ,����ʧ��!");
		}
	}

	@Override
	public void removecommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		
		System.out.println("��������Ʒ���");
		
		String f = sc.next();
		
		boolean isnumber = false;
		
		for (int i = 0; i <arrayList.size(); i++) {
			
			String u = arrayList.get(i).getNumber();
			
			if (u.equals(f)) {
				
				System.out.println("��������������");
				int p = sc.nextInt();
				
				
				if(arrayList.get(i).getQuantity()>=p){
					
					arrayList.get(i).setQuantity(arrayList.get(i).getQuantity()-p);
					
					System.out.println("���ۺ������Ϊ:"+arrayList.get(i).getQuantity());
					
					System.out.println(arrayList.get(i).toString());
				}
				isnumber = true;
				
			}
			
		}
		if (!isnumber) {
			
			System.out.println("��治�㣬����ʧ�ܣ�");
			
		}

	}

	@Override
	public void infocommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}

	}

	

}
