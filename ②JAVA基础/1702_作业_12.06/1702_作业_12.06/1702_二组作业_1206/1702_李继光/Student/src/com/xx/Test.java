package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> arrs = new ArrayList<Student>();
		ArrayScore arr = new ArrayScore();
		Scanner as  = new Scanner(System.in);
		boolean isQuit = true;
		boolean isSuQuit;
		int key = 0;
		arr.help();
		while (isQuit) {
			key = as.nextInt();
			switch (key) {
			case 1:
				System.out.println("��������Ҫ¼���ѧ���ɼ�");
				arr.addStudent(arrs, as);
				break;
			case 2:
				arr.infoStudent(arrs);
				break;
			case 3:
				arr.helpMax();
				isSuQuit = true;
				while (isSuQuit) {
					key = as.nextInt();
					switch (key) {
					case 1:
						arr.getMax(arrs, "�ܷ�");
						break;
					case 2:
						arr.getMax(arrs, "��ѧ");
						break;
					case 3:
						arr.getMax(arrs, "����");
						break;
					case 4:
						arr.getMax(arrs, "Ӣ��");
						break;
					case 5:
						isSuQuit = false;
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
		System.out.println("��л����ʹ�ã��ټ�");
		
	}
}
