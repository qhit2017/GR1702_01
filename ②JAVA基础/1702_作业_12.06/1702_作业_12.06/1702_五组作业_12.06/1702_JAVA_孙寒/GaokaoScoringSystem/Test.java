package GaokaoScoringSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student>arrayList=new ArrayList<Student>();
		StudentSerive studentserive=new StudentSerive();
		
		Scanner sc=new Scanner(System.in);
		
		studentserive.helpinfo();
		
		boolean isQuit=true;
		boolean isQabuit=true;
		int k=0;
		int key=0;
		
		while (isQuit) {
			key=sc.nextInt();
			
			switch (key) {

			case 1:
				System.out.println("录入考试信息");
				studentserive.addStudent(arrayList, sc);
				
				break;
			case 2:
				System.out.println("显示所有考生信息");
				studentserive.infoStudent(arrayList);
				
				break;
			case 3:
				studentserive.helpinfoZi();
				isQabuit=true;
				while (isQabuit) {
					k=sc.nextInt();
					switch (k) {
					case 1:
						studentserive.getMax(arrayList,"总成绩");
						
						break;
					case 2:
						studentserive.getMax(arrayList, "数学最高分");
						
						break;
					case 3:
						studentserive.getMax(arrayList, "语文最高分");
						
						break;
					case 4:
						studentserive.getMax(arrayList, "英语最高分");
						
						break;
					case 5:
						studentserive.helpinfo();
						isQabuit=false;
						break;

					default:
						break;
					}
					
				}System.out.println("退出");
				break;
			case 4:
				
				
				break;
				

			default:
				break;
			}
		}
		System.out.println("退出");
	}
	

}
