package com.ooo;

import java.util.ArrayList;
import java.util.Scanner;

/*�����ˣ�����
 *����2017��12��5��ʱ������4:56:08
 *����:2408368509@qq.com
 */

public class ScoreService implements IScore {
	
	void helpinfo(){
		System.out.println("--------���԰�����Ϣ-------");
		System.out.println("��1������");
		System.out.println("��2����ʾ����");
		System.out.println("��3����߷�");
		System.out.println("��4���˳�����");
		
	}

	@Override
	public void AddStudent(ArrayList<Student> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String w = sc.next();
		String[] x = w.split(",");
		int length = x.length;
		if (length!=5) {
			System.out.println("���������Ϣ���������������������");
		} else {
		Student student = new Student();
		student.setName(x[0]);
		student.setId(x[1]);
		student.setEnglish(Double.parseDouble(x[2]));
		student.setChiese(Double.parseDouble(x[3]));
		student.setMath(Double.parseDouble(x[4]));
		arrayList.add(student);
		System.out.println(student);
	}
	}
	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
	}

	@Override
	public double getMAX(ArrayList<Student> arrayList, Scanner sc) {
		System.out.println("���û�ѡ��3ʱ������ʾһ���Ӳ˵���");
		System.out.println("1 ��ӡ������߷�");
		System.out.println("2 ��ӡ��ѧ��߷�");
		System.out.println("3 ��ӡӢ����߷�");
		System.out.println("4 ��ӡ�ܷ���߷�");
		System.out.println("5 �˳�");
		boolean isexit=true;
		while (isexit) {
			int nextInt = sc.nextInt();
			switch (nextInt) {
			case 1:
				double maxLanguage=0;
				
				for (int i = 0; i < arrayList.size(); i++) {
					double chiese = arrayList.get(i).getChiese();
					if (chiese>maxLanguage) {
						maxLanguage=chiese;
					}
				}
				System.out.println("������߷�Ϊ��"+maxLanguage);
				break;
			case 2:
				double maxMath=0;
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getMath()>maxMath) {
						maxMath=arrayList.get(i).getMath();
					}
				}
				System.out.println("��ѧ��߷֣�"+maxMath);
				break;
			case 3:
				double maxEnglish=0;
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getEnglish()>maxEnglish) {
						maxEnglish=arrayList.get(i).getEnglish();
					}
				}
				System.out.println("Ӣ����߷֣�"+maxEnglish);
				break;
			case 4:
				double maxScore=0;
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getScore()>maxScore) {
						maxScore=arrayList.get(i).getScore();
					}
				}
				System.out.println("�ܷ���߷�Ϊ��"+maxScore);
				break;
			case 5:
				isexit=false;
				break;
			default:
				System.out.println("ָ����Ч");
				break;
			}
		}
		System.out.println("���˳���߷ֹ���ϵͳ");
		return 0;
		// TODO Auto-generated method stub
	}

	
}
