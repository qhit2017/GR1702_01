package kaoshi3;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��12��6�� ����6:39:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class CommodityService implements ICommodity {
	void hellp(){
		System.out.println("������ϵͳ");
		System.out.println("1  ������Ʒ");
		System.out.println("2  ������Ʒ����");
		System.out.println("3  ������Ʒ����");
		System.out.println("4  �鿴���");
		System.out.println("5  �˳�");
		
	}

	@Override
	public void add(ArrayList<Commodity> arrayList, Scanner sc) {
		String a = sc.next();
		String[] a1 = a.split(",");
		Commodity a2 = new Commodity(a1[0], a1[1], Integer.parseInt(a1[2]), Integer.parseInt(a1[3]));
		arrayList.add(a2);
		System.out.println(a2.toString());
	}

	@Override
	public void add1(ArrayList<Commodity> arrayList, Scanner sc) {
		//���
		System.out.println("��������");
		String a = sc.next();
		
		//���±�
		for (int i = 0; i < arrayList.size(); i++) {
			String number = arrayList.get(i).getNumber();
			if (number.equals(a)) {
				System.out.println("�������������");
				int s = sc.nextInt();
				arrayList.get(i).setAmount(arrayList.get(i).getAmount()+s);
			}
		}
		info(arrayList);
	}

	@Override
	public void remove(ArrayList<Commodity> arrayList, Scanner sc) {
		//���
		System.out.println("��������");
		String a = sc.next();
		
		//���±�
		for (int i = 0; i < arrayList.size(); i++) {
			String number = arrayList.get(i).getNumber();
			if (number.equals(a)) {
				System.out.println("���������۶���");
				int s = sc.nextInt();
				arrayList.get(i).setAmount(arrayList.get(i).getAmount()-s);
			}
		}
		info(arrayList);
		
		

	}

	@Override
	public void info(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}

	}

}
