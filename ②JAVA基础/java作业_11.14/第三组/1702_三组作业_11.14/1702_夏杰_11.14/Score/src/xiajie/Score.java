package xiajie;

import java.util.Scanner;

public class Score {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入学生成绩：");
		
		 int a = sc.nextInt();
		 
		 if(a >= 90 && a <= 100){
			 System.out.println("该学生成绩为A级");
			 }else if(a >= 60 && a < 90) {
				 System.out.println("该学生成绩为B级");
			 }else if(a < 60 && a>=0) {
				 System.out.println("该学生成绩为C级");
			 }else {
				 System.out.println("数据有误！");
			 }
		
	}

}
