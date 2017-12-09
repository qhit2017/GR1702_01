package kaoshi;

import java.util.ArrayList;
import java.util.Scanner;

public class Array implements IArray {

	@Override
	public void help() {
		System.out.println("---�߿�����ϵͳ---");
		System.out.println("1   ¼�뿼����Ϣ");
		System.out.println("2   ��ʾ������Ϣ");
		System.out.println("3   ��ʾ�Ӳ˵�");
		System.out.println("4   �˳�ϵͳ");
	}

	public void help1() {
		System.out.println("---��ϵͳ---");
		System.out.println("1    ��ӡ�ܷ���߷�");
		System.out.println("2    ��ӡ��ѧ��߷�");
		System.out.println("3    ��ӡ������߷�");
		System.out.println("4    ��ӡӢ����߷�");
		System.out.println("5    �˳�");
	}

	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		String k = sc.next();
		String[] a = k.split(",");
		if (a.length != 6) {
			System.out.println("��ʽ����ȷ,����������");
		} else {
			Student s = new Student(a[0], a[1], Double.parseDouble(a[2]),
					Double.parseDouble(a[3]), Double.parseDouble(a[4]),Double.parseDouble(a[5]));
			arrayList.add(s);
			System.out.println(s.toString());
		}
	}

	public void infoStudent(ArrayList<Student> arrayList) {
		for (Student student : arrayList) {
			System.out.println(student.toString());
		}
	}

	@Override
	public double maxStudent(ArrayList<Student> arrayList, String subject) {
		double max=0;
		if(subject.equals("�ܳɼ�")){
			max=arrayList.get(0).getTotal();
			for (int i = 0; i < arrayList.size(); i++) {
				if(max<arrayList.get(i).getTotal()){
					max=arrayList.get(i).getTotal();
				}
			}
		}
		
		if(subject.equals("��ѧ")){
			max=arrayList.get(0).getMathematic();
			for (int i = 0; i < arrayList.size(); i++) {
				if(max<arrayList.get(i).getMathematic()){
					max=arrayList.get(i).getMathematic();
				}
			}
		}
		if(subject.equals("����")){
			max=arrayList.get(0).getChineses();
			for (int i = 0; i < arrayList.size(); i++) {
				if(max<arrayList.get(i).getChineses()){
					max=arrayList.get(i).getChineses();
				}
			}
		}
		if(subject.equals("Ӣ��")){
			max=arrayList.get(0).getEnglish();
			for (int i = 0; i < arrayList.size(); i++) {
				if(max<arrayList.get(i).getEnglish()){
					max=arrayList.get(i).getEnglish();
				}
			}
		}
		
		System.out.println(max);
		return max;

	}

}
