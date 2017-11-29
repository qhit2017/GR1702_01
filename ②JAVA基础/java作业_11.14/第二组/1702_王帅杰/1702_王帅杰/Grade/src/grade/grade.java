package grade;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月14日 下午8:12:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class grade {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("请输入学生的成绩：");
	int t = sc.nextInt();
	if(t>=90&&t<=100){
		System.out.println("该学生的成绩为A");
	}else if(t>=60){
		System.out.println("该学生的成绩为：B");
	}else{
		System.out.println("该学生的成绩为：C");
	}
	sc.close();
	
	
	
}
}
