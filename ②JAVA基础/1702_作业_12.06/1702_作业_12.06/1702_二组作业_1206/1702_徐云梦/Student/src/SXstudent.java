import java.util.ArrayList;
import java.util.Scanner;


public class SXstudent implements IStudent{

	public void help(){
		System.out.println("---�߿�����ϵͳ---");
		System.out.println("1.¼�뿼����Ϣ");
		System.out.println("2.��ʾ���п�����Ϣ");
		System.out.println("3.�����Ӳ˵�");
		System.out.println("4.�˳�");
	}
	
	void helpc(){
		System.out.println("---�Ӳ˵�---");
		System.out.println("1.��ӡ�ܷ���߷�");
		System.out.println("2.��ӡ��ѧ��߷�");
		System.out.println("3.��ӡ������߷�");
		System.out.println("4.��ӡӢ����߷�");
		System.out.println("5.�˳��Ӳ˵�");
	}
	
	
	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
	    String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 6) {
			System.out.println("������ĸ�ʽ����ȷ���밴��������001��89��78��88��255������д");
		} else {
			Student A = new Student(a[0],a[1],Double.parseDouble(a[2]),Double.parseDouble(a[3]),Double.parseDouble(a[4]),Double.parseDouble(a[5]));
			arrayList.add(A);
			System.out.println(A.toString());
		}
	}

	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		//��ǿforѭ��
		for (Student student : arrayList) {
			System.out.println(student.toString());
		}
		
	}

	@Override
	public double findMaxStudent(ArrayList<Student> arrayList, String subject) {
		double Max = 0;
		if (subject.equals("�ܷ�")) {
			Max = arrayList.get(0).getTotal();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotal() > Max) {
					Max = arrayList.get(i).getTotal();
				}
			}
			
		}
		if (subject.equals("��ѧ")) {
			Max = arrayList.get(0).getMath();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMath() > Max) {
					Max = arrayList.get(i).getMath();
				}
			}
			
		}
		if (subject.equals("����")) {
			Max = arrayList.get(0).getChinese();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinese() > Max) {
					Max = arrayList.get(i).getChinese();
				}
			}
			
		}
		if (subject.equals("Ӣ��")) {
			Max = arrayList.get(0).getEnglish();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglish() > Max) {
					Max = arrayList.get(i).getEnglish();
				}
			}
		}
		System.out.println(Max);
		return Max;
	}

}
