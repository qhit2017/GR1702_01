/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��6�� ����7:26:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Test03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Property> arrayList = new ArrayList<Property>();

		CommodityPractice commodityPractice = new CommodityPractice();

		commodityPractice.menu();

		int key;
		boolean isQrue = true;
		while (isQrue) {

			System.out.println("\n����������ָ�");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("---������¼����Ϣ��---");
				System.out.println("��ʽΪ��");
				System.out.println("�����,����,�۸�,������");
				commodityPractice.add(arrayList, sc);
				break;
			case 2:
				commodityPractice.stock(arrayList, sc);
				break;
			case 3:
				commodityPractice.market(arrayList, sc);
				break;
			case 4:
				commodityPractice.info(arrayList);
				break;
			case 5:
				isQrue = false;
				break;

			default:
				System.out.println("\n�������ָ������");
				break;
			}

		}
		System.out.println("\n�˳�ϵͳ");
	}

}
