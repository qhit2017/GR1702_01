package com.ooo;

import java.util.ArrayList;
import java.util.Scanner;

/*制作人：王欣
 *日期2017年12月5日时间下午4:56:20
 *邮箱:2408368509@qq.com
 */

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> arrayList = new ArrayList<Student>();
		ScoreService service = new ScoreService();
		service.helpinfo();
		boolean isQuit = true;
		
		int key = 0;
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请录入考试信息，每项信息之间用逗号隔开"+"编号"+"成绩");
				service.AddStudent(arrayList, sc);
				
				break;
			case 2:
				System.out.println("显示所有考生信息"+"编号,语文，数学，英语");
				service.infoStudent(arrayList);
				
				break;
			case 3:
				service.getMAX(arrayList, sc);
			case 4:
				isQuit=false;
				break;
			default:
				System.out.println("你输入的命令无效");
				break;
			}
			
		}System.out.println("拜拜");
	}

}
