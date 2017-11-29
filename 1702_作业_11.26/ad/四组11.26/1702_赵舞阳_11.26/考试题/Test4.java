import java.util.Scanner;


public class Test4 {
	public static void main(String[] args) {
		System.out.println("第四题:");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩:");
		int a = sc.nextInt();
		if(a>=90){
			System.out.println("A");
		}else if(a>=60&&a<90){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		sc.close();
	}
}
