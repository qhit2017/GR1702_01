package GaokaoScoringSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.security.auth.Subject;

public class StudentSerive implements IStudent {
	
	 private Object subject;
	void helpinfo() {
		System.out.println("~~~~~�߿�����ϵͳ~~~~~");
		System.out.println("��1��¼�뿼���ĸ߿���Ϣ");
		System.out.println("��2����ʾ���п�����Ϣ");
		System.out.println("��3����ѯ��߷�, ����: �ܷ���߷� �� ������߷�");
		System.out.println("��4���˳��߿�����ϵͳ");
	}
	 void helpinfoZi(){
		 
		System.out.println("~~~~~�߿�������ϵͳ~~~~~");
		System.out.println("��1����ӡ�ܷ���߷�");
		System.out.println("��2����ӡ��ѧ��߷�");
		System.out.println("��3����ӡ������߷�");
		System.out.println("��4����ӡӢ����߷�");
		System.out.println("��5���˳��߿�����ϵͳ");
	 }
	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		String s1=sc.next();
		
		String[] a=s1.split(",");
		int leanth=a.length;
		if (leanth!=5) {
			System.out.println("�������Ϣ��ʽ����ȷ");
		}else{
			Student student=new Student();
			student.setId(a[0]);
			student.setName(a[1]);
			student.setYvwenchengji(Double.parseDouble(a[2]));
			student.setShuxuechengji(Double.parseDouble(a[3]));
			student.setEnglishchengji(Double.parseDouble(a[4]));
			arrayList.add(student);
			System.out.println(student.toString());

		}
		

	}
	@Override
	public void findByName(ArrayList<Student> arrayList, String name) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student=arrayList.get(i);
			String name1 = student.getName();
			if (name1.equals(name)) {
				System.out.println(student.toString());
			}
		}
	}

	@Override
	public void findById(ArrayList<Student> arrayList, String id) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student=arrayList.get(i);
			String id1=student.getId();
			if (id1.equals(id)) {
				System.out.println(student.toString());
			}
		}

	}

	@Override
	public void findByYvwenchengji(ArrayList<Student> arrayList,
			double yvwenchengji) {
	double	Max=arrayList.get(0).getYvwenchengji();
		for (int i = 0; i < arrayList.size(); i++) {
			
			if (arrayList.get(i).getYvwenchengji()>Max) {
				Max =arrayList.get(i).getYvwenchengji();
			}
		}System.out.println(Max);

	}

	@Override
	public void findByShuxuechengji(ArrayList<Student> arrayList,
			double shuxuechengji) {
		double	Max=arrayList.get(0).getShuxuechengji();
		for (int i = 0; i < arrayList.size(); i++) {
			
			if (arrayList.get(i).getShuxuechengji()>Max) {
				Max =arrayList.get(i).getShuxuechengji();
			}
		}System.out.println(Max);

	}

	@Override
	public void findByEnglishchengji(ArrayList<Student> arrayList,
			double englishchengji) {
		double	Max=arrayList.get(0).getEnglishchengji();
		for (int i = 0; i < arrayList.size(); i++) {
			
			if (arrayList.get(i).getEnglishchengji()>Max) {
				Max =arrayList.get(i).getEnglishchengji();
			}
		}System.out.println(Max);

	}

	@Override
	public void findByZongchengji(ArrayList<Student> arrayList,
			double zongchengji) {
		double Max=0;
		if (subject.equals("�ܳɼ�")) {
			Max=arrayList.get(0).getZongchengji();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getZongchengji()>Max) {
					Max=arrayList.get(i).getZongchengji();
				}
			}System.out.println(Max);
		}
		
	}

	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student=arrayList.get(i);
			System.out.println(student.toString());
		}

	}
	public void getMax(ArrayList<Student> arrayList, String string) {
		// TODO Auto-generated method stub
		
	}

	

}
