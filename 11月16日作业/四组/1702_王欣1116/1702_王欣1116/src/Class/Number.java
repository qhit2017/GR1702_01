package Class;

import java.util.Scanner;

/*制作人：王欣
 *制作时间：2017年11月16日下午9:57:35
 *邮箱：2408368509@qq.com
 */

public class Number {
	//从键盘输入4个整数，
	//编写程序实现对这4 个整数从大到小的顺序排列输出。
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = m.nextInt();
		System.out.println("请输入第二个数：");
		int b = m.nextInt();
		System.out.println("请输入第三个数：");
		int c = m.nextInt();
		System.out.println("请输入第四个数：");
		int d = m.nextInt();
		int n;
		if(a<b){
			n=a;
			a=b;
			b=n;
		}
		if(a<c){
			n=c;
			c=a;
			a=n;
		}
		if(a<d){
			n=d;
			d=a;
			a=n;
		}
		if(b<c){
			n=b;
			b=c;
			c=n;
		}
		if(b<d){
			n=b;
			b=d;
			d=n;
		}
		if(c<d){
			n=c;
			c=d;
			d=n;
		}
		System.out.println("输出这4 个整数从大到小的顺序为：");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
		
	}

}
