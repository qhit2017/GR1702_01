package com.kyh;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<MarkingSystem> arrayList = new ArrayList<MarkingSystem>();
		Scanner sc = new Scanner(System.in);
		MarkingSysteml markingSystem = new MarkingSysteml();
		markingSystem.help();

		boolean condition = true;
		while (condition) {
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("������ѧ���ɼ�,��ʽ���£�");
				System.out.println("����,001,�����ĳɼ���,����ѧ�ɼ���,��Ӣ��ɼ�����");
				markingSystem.addArrayList(arrayList, sc);
				break;

			case 2:
				markingSystem.infoArrayList(arrayList);
				break;

			case 3:
				markingSystem.inhelp();
				boolean a = true;
				while (a) {

					int key1 = sc.nextInt();
					switch (key1) {

					case 1:

						markingSystem.findMaxArrayList(arrayList, "�ܷ�");
						break;

					case 2:

						markingSystem.findMaxArrayList(arrayList, "��ѧ");
						break;

					case 3:

						markingSystem.findMaxArrayList(arrayList, "Ӣ��");
						break;

					case 4:

						markingSystem.findMaxArrayList(arrayList, "����");
						break;

					case 5:
						a = false;

						break;

					default:
						break;
					}
				}
				markingSystem.help();
				break;
			case 4:
				condition = false;
				break;

			default:
				break;
			}
		}
		System.out.println("�ټ���ллʹ�ã�����");
	}

}
