package face;

import java.util.Scanner;

public class Calculate {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入学生成绩：");
	int a = sc.nextInt();
if (a>=90){
	System.out.println("A");
}else if(90>a&&a>=60){
	System.out.println("B");
}else if(a<60){
	System.out.println("C");
}
	
	sc.close();
}
}

