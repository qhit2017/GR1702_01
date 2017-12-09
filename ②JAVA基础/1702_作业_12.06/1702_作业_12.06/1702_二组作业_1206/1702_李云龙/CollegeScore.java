package zk.college.com;

import java.util.ArrayList;
import java.util.Scanner;

public class CollegeScore implements ICollege {
	public void hoip() {
		System.out.println("---�߿�����ϵͳ");
		System.out.println("1.¼�뿼����Ϣ");
		System.out.println("2.��ʾ���п�����Ϣ");
		System.out.println("3.�����Ӳ˵�");
		System.out.println("4.�˳�");
	}

	public void d() {
		System.out.println("---�Ӳ˵�---");
		System.out.println("1.��ӡ�ܷ���߷�");
		System.out.println("2.��ӡ��ѧ��߷�");
		System.out.println("3.��ӡ������߷�");
		System.out.println("4.��ӡӢ����߷�");
		System.out.println("5.�˳�ϵͳ");

	}

	@Override
	public void addCollege(ArrayList<College> arrayList, Scanner sc) {
		String a = sc.next();
		String[] s = a.split(",");
		if (s.length != 6) {
			System.out.println("");
		} else {
			College c = new College(s[0], s[1], Double.parseDouble(s[2]),
					Double.parseDouble(s[3]), Double.parseDouble(s[4]));
			arrayList.add(c);
			System.out.println(c.toString());
		}

	}

	@Override
	public void infoCollege(ArrayList<College> arrayList) {
		for (College college : arrayList) {
			System.out.println(college.toString());
		}

	}

	@Override
	public void getMax(ArrayList<College> arrayList, String s) {
		double Max = 0;
		if (s.equals("�ܷ�")) {
			Max = arrayList.get(0).getPoints();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getPoints() > Max) {
					Max = arrayList.get(i).getPoints();
				}
			}

		}
		if (s.equals("��ѧ")) {
			Max = arrayList.get(0).getMathematics();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathematics() > Max) {
					Max = arrayList.get(i).getMathematics();
				}
			}

		}
		if (s.equals("����")) {
			Max = arrayList.get(0).getLanguage();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getLanguage() > Max) {
					Max = arrayList.get(i).getLanguage();
				}
			}
		}
		if (s.equals("Ӣ��")) {
			Max = arrayList.get(0).getEnglish();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglish() > Max) {
					Max = arrayList.get(i).getEnglish();
				}
			}

		}
		System.out.println(Max);
		return;
	}
}
