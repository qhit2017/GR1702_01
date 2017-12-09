package kaoshi;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> arrayList =new ArrayList<Student>();
		Array a=new Array();
		Scanner sc=new Scanner(System.in);
		a.help();
		int i=0;
		boolean isquit = true;
		while (isquit) {
			 i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("请输入考生信息");
				a.addStudent(arrayList, sc);
				break;
			case 2:
				a.infoStudent(arrayList);
				break;
			case 3:
				a.help1();
				int b;
				boolean is = true;
				while (is) {
					 b = sc.nextInt();
					 switch (b) {
					case 1:
						a.maxStudent(arrayList, "总成绩");
						break;
					case 2:
						a.maxStudent(arrayList, "数学");
						break;
					case 3:
						a.maxStudent(arrayList, "语文");
						break;
					case 4:
						a.maxStudent(arrayList, "英语");
						break;
					case 5:
						is=false;
						break;
					default:
						break;
					}
					 
				}
				System.out.println("退出子系统");
				a.help();
				break;
			case 4:
				isquit=false;
				break;
			default:
				break;
			}
		}
	
		
System.out.println("再见！！！！");
	}

}
