package com.grade;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList<Grade> arrayList = new ArrayList<Grade>(10);
		GradeService grade = new GradeService() {
			
			@Override
			public double getMax(ArrayList<Grade> arrayList, Scanner subject, String sc) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		Scanner sc = new Scanner(System.in);
		grade.getHelp();
		boolean isquit=true;
		int key;
		
		while (isquit) {
			key=sc.nextInt();
			switch (key) {
			case 1:
				grade.addMessage(arrayList, sc);
				break;
				
			case 2:
				grade.infoPoint(arrayList);
				break;
				
			case 3:
				boolean isreturn = true;
				int a;
				System.out.println("1	��ӡ�ܷ���߷�");
				System.out.println("2	��ӡ��ѧ��߷�");
				System.out.println("3	��ӡ������߷�");
				System.out.println("4	��ӡӢ����߷�");
				System.out.println("5	�˳�");
				while (isreturn) {
					a=sc.nextInt();
					switch (a) {
					case 1:
						grade.getMax(arrayList, "��߷�", sc);
						break;
						
					case 2:
						grade.getMax(arrayList, "��ѧ", sc);
						break;

						
					case 3:
						grade.getMax(arrayList, "����", sc);
						break;

					case 4:
						grade.getMax(arrayList, "Ӣ��", sc);
						break;
						
					case 5:
						isreturn=false;
						break;


					default:
						System.out.println("����ָ����Ч��");
						break;
					}
				}
				System.out.println("���ص�������");
				break;
				
			case 4:
				isquit=false;
				break;

			default:
				break;
			}
		}
		System.out.println("�˳�ϵͳ��");
	}
	
	

}
