package com.grade;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList<Grade> arrayList = new ArrayList<Grade>(10);
		GradeService grade = new GradeService() {
			
			@Override
			public double getMax(ArrayList<Grade> arrayList, Scanner subject, String sc) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		Scanner sc = new Scanner(System.in);
		grade.getHelp();
		boolean isquit=true;
		int key;
		
		while (isquit) {
			key=sc.nextInt();
			switch (key) {
			case 1:
				grade.addMessage(arrayList, sc);
				break;
				
			case 2:
				grade.infoPoint(arrayList);
				break;
				
			case 3:
				boolean isreturn = true;
				int a;
				System.out.println("1	打印总分最高分");
				System.out.println("2	打印数学最高分");
				System.out.println("3	打印语文最高分");
				System.out.println("4	打印英语最高分");
				System.out.println("5	退出");
				while (isreturn) {
					a=sc.nextInt();
					switch (a) {
					case 1:
						grade.getMax(arrayList, "最高分", sc);
						break;
						
					case 2:
						grade.getMax(arrayList, "数学", sc);
						break;

						
					case 3:
						grade.getMax(arrayList, "语文", sc);
						break;

					case 4:
						grade.getMax(arrayList, "英语", sc);
						break;
						
					case 5:
						isreturn=false;
						break;


					default:
						System.out.println("输入指令无效！");
						break;
					}
				}
				System.out.println("返回到主界面");
				break;
				
			case 4:
				isquit=false;
				break;

			default:
				break;
			}
		}
		System.out.println("退出系统！");
	}
	
	

}
