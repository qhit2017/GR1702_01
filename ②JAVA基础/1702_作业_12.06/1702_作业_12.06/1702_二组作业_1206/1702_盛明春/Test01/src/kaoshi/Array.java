package kaoshi;

import java.util.ArrayList;
import java.util.Scanner;

public class Array implements IArray {

	@Override
	public void help() {
		System.out.println("---高考评分系统---");
		System.out.println("1   录入考生信息");
		System.out.println("2   显示考生信息");
		System.out.println("3   显示子菜单");
		System.out.println("4   退出系统");
	}

	public void help1() {
		System.out.println("---子系统---");
		System.out.println("1    打印总分最高分");
		System.out.println("2    打印数学最高分");
		System.out.println("3    打印语文最高分");
		System.out.println("4    打印英语最高分");
		System.out.println("5    退出");
	}

	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		String k = sc.next();
		String[] a = k.split(",");
		if (a.length != 6) {
			System.out.println("格式不正确,请重新输入");
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
		if(subject.equals("总成绩")){
			max=arrayList.get(0).getTotal();
			for (int i = 0; i < arrayList.size(); i++) {
				if(max<arrayList.get(i).getTotal()){
					max=arrayList.get(i).getTotal();
				}
			}
		}
		
		if(subject.equals("数学")){
			max=arrayList.get(0).getMathematic();
			for (int i = 0; i < arrayList.size(); i++) {
				if(max<arrayList.get(i).getMathematic()){
					max=arrayList.get(i).getMathematic();
				}
			}
		}
		if(subject.equals("语文")){
			max=arrayList.get(0).getChineses();
			for (int i = 0; i < arrayList.size(); i++) {
				if(max<arrayList.get(i).getChineses()){
					max=arrayList.get(i).getChineses();
				}
			}
		}
		if(subject.equals("英语")){
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
