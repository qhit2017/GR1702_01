package com.lyl.qhit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Informationtest {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		StudentRealize studentRealize = new StudentRealize();

		studentRealize.helpinfo();

		boolean isQust = true;
		boolean subisQust=false;

		int key;
		while (isQust) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("�����뿼������Ϣ���������ʽ��");
				System.out.println("��������,���,���ĳɼ�,��ѧ�ɼ�, Ӣ��ɼ�,�ܷ�");
				studentRealize.addInformation(arrayList, sc);
				studentRealize.infoInformation(arrayList);
				break;
			case 2:
				studentRealize.infoInformation(arrayList);
				

				break;
			case 3:
				studentRealize.subHelp();
				  subisQust = true;
				while (subisQust) {
					key = sc.nextInt();
					switch (key) {
					
					case 1:
					studentRealize.getMax(arrayList, "�ܷ�");
						

						break;
					case 2:
						studentRealize.getMax(arrayList, "����");
						break;

					case 3:
						studentRealize.getMax(arrayList, "��ѧ");

						break;

					case 4:
						studentRealize.getMax(arrayList, "Ӣ��");
						break;

					case 5:
						 subisQust= false;
						System.out.println("�˳��Ӳ˵�");
						break;
					default:
						break;
					}

				}

				break;

			case 4:
				isQust = false;
				break;
			default:
				System.out.println("�������ָ����Ч��");
				break;
			}
			
		}
		System.out.println("��л���ʹ�ã��ټ���");
	}
}
