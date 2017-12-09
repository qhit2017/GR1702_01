import java.util.ArrayList;
import java.util.Scanner;


public class SXstudent implements IStudent{

	public void help(){
		System.out.println("---高考评分系统---");
		System.out.println("1.录入考试信息");
		System.out.println("2.显示所有考生信息");
		System.out.println("3.进入子菜单");
		System.out.println("4.退出");
	}
	
	void helpc(){
		System.out.println("---子菜单---");
		System.out.println("1.打印总分最高分");
		System.out.println("2.打印数学最高分");
		System.out.println("3.打印语文最高分");
		System.out.println("4.打印英语最高分");
		System.out.println("5.退出子菜单");
	}
	
	
	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
	    String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 6) {
			System.out.println("你输入的格式不正确，请按“张三，001，89，78，88，255”这样写");
		} else {
			Student A = new Student(a[0],a[1],Double.parseDouble(a[2]),Double.parseDouble(a[3]),Double.parseDouble(a[4]),Double.parseDouble(a[5]));
			arrayList.add(A);
			System.out.println(A.toString());
		}
	}

	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		//增强for循环
		for (Student student : arrayList) {
			System.out.println(student.toString());
		}
		
	}

	@Override
	public double findMaxStudent(ArrayList<Student> arrayList, String subject) {
		double Max = 0;
		if (subject.equals("总分")) {
			Max = arrayList.get(0).getTotal();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotal() > Max) {
					Max = arrayList.get(i).getTotal();
				}
			}
			
		}
		if (subject.equals("数学")) {
			Max = arrayList.get(0).getMath();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMath() > Max) {
					Max = arrayList.get(i).getMath();
				}
			}
			
		}
		if (subject.equals("语文")) {
			Max = arrayList.get(0).getChinese();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinese() > Max) {
					Max = arrayList.get(i).getChinese();
				}
			}
			
		}
		if (subject.equals("英语")) {
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
