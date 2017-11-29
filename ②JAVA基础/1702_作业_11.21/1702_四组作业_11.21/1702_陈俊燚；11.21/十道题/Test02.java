import java.util.Scanner;


public class Test02 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("请输入第一个小数 a：");
	 double a=sc.nextDouble();
	 System.out.print("请输入第二个小数 b：");
	 double b=sc.nextDouble();
	 if(a>b){
		 System.out.println("a>b");
	 }else if(a<b){
		 System.out.println("a<b");
	 }else{
		 System.out.println("它们相等");
	 }
	 }
}
