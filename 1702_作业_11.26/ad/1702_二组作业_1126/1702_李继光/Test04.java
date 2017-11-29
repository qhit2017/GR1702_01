package ssssss;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i<0||i>100){
			System.out.println("ÊäÈë´íÎó");
		}else if(i>=90){
			System.out.println("A");
		}else if(i>=60){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		sc.close();
}
}
