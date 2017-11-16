 package option;

import java.util.Scanner;

public class Option {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入学生的成绩：");
	int s = sc.nextInt();
	if(s>=90&&s<=100){
		System.out.println("该学生的成绩为A");
	}else if(s>=60){
		System.out.println("该学生的成绩为B");
	}else{
		System.out.println("该学生的成绩为C");
	}
    sc.close();
}
}
