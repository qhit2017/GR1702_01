import java.util.Scanner;


public class Test02 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("�������һ��С�� a��");
	 double a=sc.nextDouble();
	 System.out.print("������ڶ���С�� b��");
	 double b=sc.nextDouble();
	 if(a>b){
		 System.out.println("a>b");
	 }else if(a<b){
		 System.out.println("a<b");
	 }else{
		 System.out.println("�������");
	 }
	 }
}
