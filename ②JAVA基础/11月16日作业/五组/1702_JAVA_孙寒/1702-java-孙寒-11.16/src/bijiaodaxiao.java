import java.util.Scanner;


public class bijiaodaxiao {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("�������һ����");
		int a=in.nextInt();
		
		System.out.println("������ڶ�����");
		int b=in.nextInt();
		
		System.out.println("�������������");
		int c=in.nextInt();
		
		System.out.println("��������ĸ���");
		int d=in.nextInt();
		
		int j;
		if(a>b){
			j=a;
			a=b;
			b=j;
		}
		if(a>c){
			j=a;
			a=c;
			c=j;
		}
		if(a>d){
			j=a;
			a=d;
			d=j;
		}
		if(b>c){
			j=b;
			b=c;
			c=j;
		}
		if(b>d){
			j=b;
			b=d;
			d=j;
		}
		System.out.println(a+" "+b+" "+c+" "+d);
}
}