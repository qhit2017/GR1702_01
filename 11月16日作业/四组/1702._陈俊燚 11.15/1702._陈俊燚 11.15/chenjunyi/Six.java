package chenjunyi;

import java.util.Scanner;

//从键盘输入4个整数，编写程序实现对这4 个整数从大到小的顺序排列输出
public class Six {
public static void main(String[] args) {
			System.out.println("第六题");
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第1个数");
			int a =sc.nextInt();
			System.out.println("请输入第2个数");
			int b =sc.nextInt();
			System.out.println("请输入第3个数");
			int c =sc.nextInt();
			System.out.println("请输入第4个数");
			int d=sc.nextInt();
			int f;
			if(a>b){
				f=a;
				a=b;
				b=f;
			}
			if(a>c){
				f=a;
				a=c;
				c=f;
			}
			if(a>d){
				f=a;
				a=d;
				d=f;
			}
			if(b>c){
				f=b;
				b=c;
				c=f;
			}
			if(b>d){
				f=b;
				b=d;
				d=f;
			}
			if(c>d){
				f=c;
				c=d;
				d=f;
			}
			System.out.println("从大到小的顺序排列输出:"+d+">"+c+">"+b+">"+a);
}		
}
