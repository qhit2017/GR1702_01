import java.util.ArrayList;
import java.util.Scanner;

public class Scrvice implements Isorce {
	void helpinfo() {
		System.out.println("子菜单下的功能选项");
		System.out.println("【1】总成绩最高分");
		System.out.println("【2】语文成绩最高分");
		System.out.println("【3】数学成绩最高分");
		System.out.println("【4】英语成绩最高分");
		System.out.println("【5】退出系统");
	}

	void help() {
		System.out.println("******高考评分系统******");
		System.out.println("【1】录入考生的高考信息");
		System.out.println("【2】显示所有考生信息");
		System.out.println("【3】查询考生最高分");
		System.out.println("【4】退出功能");
	}

	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		int length = a.length;
		if (length != 5) {
			System.out.println("输入的信息有误或是格式不正确");
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
		if (subject.equals("总成绩")) {
			max = arrayList.get(0).getSum();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getSum() > max) {
					max = arrayList.get(i).getSum();
				}
			}
		}
		if (subject.equals("语文")) {
			max = arrayList.get(0).getChinese();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinese() > max) {
					max = arrayList.get(i).getChinese();
				}
			}
		}
		if (subject.equals("数学")) {
			max = arrayList.get(0).getMath();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMath() > max) {
					max = arrayList.get(i).getMath();
				}
			}
		}
		if (subject.equals("英语")) {
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
