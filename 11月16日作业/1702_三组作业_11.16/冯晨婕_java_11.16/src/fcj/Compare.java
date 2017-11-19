/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：  E-mail:2570804732@qq.com
 * @date 创建时间：16 Nov 2017 8:27:03 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Compare {
//从键盘输入4个整数，
	//编写程序实现对这4 个整数从大到小的顺序排列输出。
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a =sc.nextInt();
		System.out.println("请输入第二个数");
		int b =sc.nextInt();
		System.out.println("请输入第三个数");
		int c =sc.nextInt();
		System.out.println("请输入第四个数");
		int d =sc.nextInt();
		int m=0;
		if(a>b){
		 m=a;
		a=b;
		b=m;}
		if(a>c){
			m=a;
			a=c;
			c=m;}
				if(a>d){
					m=a;
					a=d;
					d=m;}
				
	
	if(b>c){
	m=b;
	b=c;
	c=m;}
	
	if(b>d){
		m=b;
		b=d;
		d=m;}
		 if(c>d){
			 m=c;
			 c=d;
			 d=m;
		 }
		 
		
		
		
	
	
	System.out.println(d+"\t"+c+"\t"+b+"\t"+a);
	
	
	
	
	
	
}
}