package yangxueting;

import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月23日 下午8:00:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Xingqi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("输入数字，输入星期几");
	int h=sc.nextInt();
	switch (h) {
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
		System.out.println("星期七");
		
		break;

	default:
		break;
	}sc.close();
}
}
