package shape01;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄãµÄ³É¼¨");
		int score = sc.nextInt();
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 60 && score < 89) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		sc.close();
	}
}
