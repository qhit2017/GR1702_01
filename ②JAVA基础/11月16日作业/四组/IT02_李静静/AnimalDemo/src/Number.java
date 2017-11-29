import java.util.Scanner;

 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月16日 下午9:03:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Number {
	/*从键盘输入4个整数，编写程序实现对这4 
	 * 个整数从大到小的顺序排列输出。
	 */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("请输入第一个数");
	int a = sc.nextInt();
	System.out.println("请输入第二个数");
	int b = sc.nextInt();
	System.out.println("请输入第三个数");
	int c = sc.nextInt();
	System.out.println("请输入第四个数");
	int d = sc.nextInt();
	int g ;
	if(a>b){
		g=a;
		a=b;
		b=g;		
	}
	if(a>c){
		g=a;
		a=c;
		c=g;
	}
	if(a>d){
		g=a;
		a=d;
		d=g;
	}
	if(b>c){
		g=b;
		b=c;
		c=g;
	}
	if(b>d){
		g=b;
		b=d;
		d=g;
	}
	if(c>d){
		g=c;
		c=d;
		d=g;
	}
	System.out.println(d+">"+c+">"+b+">"+a);
	
	
	
	
	
	
}
}
