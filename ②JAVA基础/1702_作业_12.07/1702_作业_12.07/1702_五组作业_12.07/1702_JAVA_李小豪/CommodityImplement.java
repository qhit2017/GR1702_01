package Com.Commodity;

import java.util.ArrayList;
import java.util.Scanner;

public class CommodityImplement implements ICommodityInterface {
	void help(){
		System.out.println("----��Ʒ����ϵͳ----");
		System.out.println("��1��������Ʒ������1");
		System.out.println("��2������������2");
		System.out.println("��3������������3");
		System.out.println("��4���ο����������4");
		System.out.println("��5���˳�����������5");
		
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String string = sc.next();
		String[]a=string.split(",");
		if (a.length!=4) {
			System.out.println("�Բ���������ĸ�ʽ����ȷ�����������룬лл��");
			
			
		} else {
			Commodity e = new Commodity(a[0], a[1], Double.parseDouble(a[2]),  Double.parseDouble(a[3]));
			arrayList.add(e);
			System.out.println(arrayList.toString());
		}

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, String Commodity) {
		

	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		

	}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
			
		}
		

	}

}
