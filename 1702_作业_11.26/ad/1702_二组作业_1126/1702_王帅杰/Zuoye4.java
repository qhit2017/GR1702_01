package Com.qhit;

import java.util.Scanner;

public class Zuoye4 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("ÇëÄãÊäÈë³É¼¨");
	int i =sc.nextInt();
	if (i>=90) {
		System.out.println("A");
	}else if (i>=60) {
		System.out.println("B");
	}else if(i<60) {
		System.out.println("C");
	}
	sc.close();
}
}
