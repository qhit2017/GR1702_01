package com.qk;

import java.util.ArrayList;
import java.util.Scanner;

/**�����ߣ�������
 *����ʱ�䣺2017��12��7������7:37:34
 *���䣺2507147605@qq.com
 */
public class Commodityste implements IArticle {

	void menu(){
		System.out.println("----����ϵͳ����-----");
		System.out.println("[1]������Ʒ������1");
		System.out.println("[2]����������2");
		System.out.println("[3]����������3");
		System.out.println("[4]�ο����������4");
		System.out.println("[5]�˳�ϵͳ������5");
	}
	@Override
	public void add(ArrayList<Commodity> arrayList, Scanner sc) {
		String a =sc.next();
		String[] split =a.split(",");
		if (split.length!=4 ) {
			System.out.println("������ĸ�ʽ����ȷ�����������");
			System.out.println("��ʽΪ");
			System.out.println("���,����,�۸�,����");
			
		}else {
			
		}

	}

	@Override
	public void info(ArrayList<Commodity> arrayList) {
	

	}

	@Override
	public void stock(ArrayList<Commodity> arrayList, Scanner sc) {
		

	}

	@Override
	public void maket(ArrayList<Commodity> arrayList, Scanner sc) {
		
	}

}
