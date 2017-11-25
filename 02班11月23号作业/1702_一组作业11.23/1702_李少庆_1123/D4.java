package animal;

import java.util.Scanner;

public class D4 {
public static void main(String[] args) {
	
	Scanner x =new Scanner(System.in);
	System.out.println("从键盘输入1~7的数字");
	int a=x.nextInt();
	switch(a){
	case 1:
		System.out.println("星期一");
		break;
	case 2:
		System.out.println("星期二");
		break;
	case 3:
		System.out.println("星期三");
		break;
	case 4:
		System.out.println("星期四");
		break;
	case 5:
		System.out.println("星期五");
		break;
	case 6:
		System.out.println("星期六");
		break;
	case 7:
		System.out.println("星期日");
		break;
		
	}
}
}
