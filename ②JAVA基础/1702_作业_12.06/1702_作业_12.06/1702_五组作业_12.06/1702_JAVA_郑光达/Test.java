/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��5�� ����7:33:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package com.Test01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Performance> arrayList = new ArrayList<Performance>();

		JieKouShiJian jieKouShiJian = new JieKouShiJian();

		jieKouShiJian.help();
		int key;
		boolean isQure = true;
		while (isQure) {
			System.out.println("\n---����������ָ�---\n");
			key = sc.nextInt();

			switch (key) {
			case 1:
				System.out.println("��������Ҫ��ӵ���Ϣ��");
				System.out.println("��ʽΪ��");
				System.out.println("����,���,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
				jieKouShiJian.add(arrayList, sc);
				break;
			case 2:
				jieKouShiJian.info(arrayList);
				break;
			case 3:
				jieKouShiJian.help1();
				int key1;
				boolean isExit = true;
				while (isExit) {
					System.out.println("��������Ҫ��ѯ��ָ�");
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						jieKouShiJian.summax(arrayList);
						break;
					case 2:
						jieKouShiJian.mathmax(arrayList);
						break;

					case 3:
						jieKouShiJian.languagemax(arrayList);
						break;
					case 4:
						jieKouShiJian.Englishmax(arrayList);
						break;

					case 5:
						isExit = false;
						System.out.println("������һ��ɹ���");
						jieKouShiJian.help();
						break;

					default:
						System.out.println("�������ָ������");
						break;
					}

				}

				break;
			case 4:
				isQure = false;
				break;

			default:
				System.out.println("�������ָ������");
				break;
			}

		}
		System.out.println("-----�˳�ϵͳ�ɹ�-----");
	}

}
