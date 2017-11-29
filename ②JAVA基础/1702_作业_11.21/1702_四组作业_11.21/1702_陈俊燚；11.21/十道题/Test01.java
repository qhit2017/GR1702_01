import java.util.Scanner;


public class Test01 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("请输入一个数：");
	 int a=sc.nextInt();
	 if(a<0){
		 System.out.println("该数是负数");
	 }else if(a>0){
		 System.out.println("该数为正数");
	 }else{
		 System.out.println("该数非正非负");
	 }
	 
}
}
