import java.util.Scanner;


public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ÊäÈë³É¼¨");
		double a = sc.nextDouble();
		if (a>=90) {
			System.out.println("A");
		}if (a>=60&&a<=89) {
			System.out.println("B");
		}if (a<60) {
			System.out.println("C");
		}
	}

}
