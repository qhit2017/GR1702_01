package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayLiStExaminee arrayLiStExaminee = new ArrayLiStExaminee();
		
		ArrayList<Examinee> arrayList = new ArrayList<Examinee>();
		
		arrayLiStExaminee.help();
		
		Scanner sc = new Scanner(System.in);
		
		boolean isQuit = true;
		while (isQuit) {
			
			System.out.println("������������س�����");
			String s = sc.next();
			switch (s) {
			case "1":
				System.out.println("�����뿼����Ϣ");
				arrayLiStExaminee.addInformation(arrayList, sc);
				break;
			case "2":
				arrayLiStExaminee.infoEntering(arrayList);
				break;
			case "3":
				arrayLiStExaminee.help3();
				boolean isExit = true;
				while(isExit){
					System.out.println("������������س�����");
				String c = sc.next();
				switch (c) {
				case "1":
					arrayLiStExaminee.findGradeMax(arrayList, "�ܳɼ�");
					break;
				case "2":
					arrayLiStExaminee.findGradeMax(arrayList, "��ѧ");
					break;
				case "3":
					arrayLiStExaminee.findGradeMax(arrayList, "����");
					break;
				case "4":
					arrayLiStExaminee.findGradeMax(arrayList, "Ӣ��");
					break;
				case "5":
					
					isExit = false;
					
					break;

				default:
					
					System.out.println("������������������������룡");
					
					break;
				}
				}
				System.out.println("���˳��Ӳ˵���");
				break;
			case "4":
				
				isQuit = false;
				
				break;

			default:
				
				System.out.println("������������������������룡");
				
				break;
			}
		}
		System.out.println("���˳�����");
		
	}

}
