import java.util.ArrayList;
import java.util.Scanner;

public class Scrvice implements Isorce {
	void helpinfo() {
		System.out.println("�Ӳ˵��µĹ���ѡ��");
		System.out.println("��1���ܳɼ���߷�");
		System.out.println("��2�����ĳɼ���߷�");
		System.out.println("��3����ѧ�ɼ���߷�");
		System.out.println("��4��Ӣ��ɼ���߷�");
		System.out.println("��5���˳�ϵͳ");
	}

	void help() {
		System.out.println("******�߿�����ϵͳ******");
		System.out.println("��1��¼�뿼���ĸ߿���Ϣ");
		System.out.println("��2����ʾ���п�����Ϣ");
		System.out.println("��3����ѯ������߷�");
		System.out.println("��4���˳�����");
	}

	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		int length = a.length;
		if (length != 5) {
			System.out.println("�������Ϣ������Ǹ�ʽ����ȷ");
		} else {
			Student student = new Student(a[0], a[1], Double.parseDouble(a[2]),
					Double.parseDouble(a[3]), Double.parseDouble(a[4]));
			arrayList.add(student);
			System.out.println(student.toString());
		}
	}

	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);
		}
	}

	@Override
	public double getMax(ArrayList<Student> arrayList, String subject) {
		double max = 0;
		if (subject.equals("�ܳɼ�")) {
			max = arrayList.get(0).getSum();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getSum() > max) {
					max = arrayList.get(i).getSum();
				}
			}
		}
		if (subject.equals("����")) {
			max = arrayList.get(0).getChinese();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinese() > max) {
					max = arrayList.get(i).getChinese();
				}
			}
		}
		if (subject.equals("��ѧ")) {
			max = arrayList.get(0).getMath();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMath() > max) {
					max = arrayList.get(i).getMath();
				}
			}
		}
		if (subject.equals("Ӣ��")) {
			max = arrayList.get(0).getEnglish();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglish() > max) {
					max = arrayList.get(i).getEnglish();
				}
			}
		}
		System.out.println(max);
		return max;
	}
}
