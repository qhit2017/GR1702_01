package com.homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * �����ߣ������� ����ʱ�䣺2017��12��7������8:33:22 ���䣺2507147605@qq.com
 */
public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<ShuXing> arrayList = new ArrayList<ShuXing>();

		ShiXianLei shiXianLei = new ShiXianLei();

		shiXianLei.zhumoun();

		boolean isQure = true;
		int key;
		while (isQure) {
			System.out.println("\n����������ָ�");
			key = sc.nextInt();

			switch (key) {
			case 1:
				System.out.println("��������Ϣ��");
				System.out.println("��ʽΪ��");
				System.out.println("����,���,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
				shiXianLei.add(arrayList, sc);
				break;

			case 2:
				shiXianLei.info(arrayList);
				break;

			case 3:
				shiXianLei.zimoun();
				boolean isExit = true;
				int key1;
				while (isExit) {
					
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						shiXianLei.findsum(arrayList);
						break;
					case 2:
						shiXianLei.findchinese(arrayList);
						break;
					case 3:
						shiXianLei.findmath(arrayList);
						break;
					case 4:
						shiXianLei.findEnglish(arrayList);
						break;
					case 5:
						isExit = false;
						shiXianLei.zhumoun();
						break;

					default:
						System.out.println("�������ָ������������");
						break;
					}

				}
				break;

			case 4:
				isQure = false;
				break;

			default:
				System.out.println("�������ָ������������");
				break;
			}

		}
		System.out.println("�˳��ɹ�");
	}

}
