package com.qjit;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Gaokao> arrayList = new ArrayList<Gaokao>();
		Gaokaoservice cservice = new Gaokaoservice();
		Scanner sc = new Scanner(System.in);
		cservice.helpInfo();
		int key = 0;
		boolean isQuit = true;
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("������");
				cservice.addGaokao(arrayList, sc);
				break;
			case 2:

				cservice.infoGaokao(arrayList);
				break;
			case 3:
				cservice.helpMax();
				boolean isQit = true;
				while (isQit) {
					key = sc.nextInt();
					switch (key) {
					case 1:
						cservice.getMax(arrayList, "�ܷ�");
						break;
					case 2:
						cservice.getMax(arrayList, "��ѧ");
						break;
					case 3:
						cservice.getMax(arrayList, "����");
						break;
					case 4:
						cservice.getMax(arrayList, "Ӣ��");
						break;
					case 5:
						isQit = false;
						break;
					default:
						break;
					}
				}
				System.out.println("���˳���߷ֲ�ѯ");
				break;
			case 4:
				isQuit = false;
				break;

			default:
				break;
			}

		}

	}

}
