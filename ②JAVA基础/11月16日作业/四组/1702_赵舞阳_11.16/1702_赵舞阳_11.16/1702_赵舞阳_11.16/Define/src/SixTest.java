import java.util.Scanner;

//从键盘输入4个整数，编写程序实现对这4 个整数从大到小的顺序排列输出。
public class SixTest {
public static void main(String[] args) {
	System.out.println("第六题:");
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入第1个数:");
	int a =sc.nextInt();
	System.out.println("请输入第2个数:");
	int b =sc.nextInt();
	System.out.println("请输入第3个数:");
	int c =sc.nextInt();
	System.out.println("请输入第4个数:");
	int d =sc.nextInt();
	int e;
	if(a>b){
		e=a;
		a=b;
		b=e;
	}
	if(a>c){
		e=a;
		a=c;
		c=e;
	}
	if(a>d){
		e=a;
		a=d;
		d=e;
	}
	if(b>c){
		e=b;
		b=c;
		c=e;
	}
	if(b>d){
		e=b;
		b=d;
		d=e;
	}
	if(c>d){
		e=c;
		c=d;
		d=e;
	}
	System.out.println("从大到小的顺序排列输出:"+d+">"+c+">"+b+">"+a);
	sc.close();
}
}
