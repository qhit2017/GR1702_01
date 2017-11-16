package xiaxiaoyu;

import java.util.Scanner;

public class TernaryConditional {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
System.out.println("ÇëÊäÈëÄãµÄ³É¼¨£º");
int a =s.nextInt();

if(a >= 90){
	System.out.println("A");
}
if(a>=60 && a<90){
	System.out.println("B");
}
if(a<60){
	System.out.println("C");
}
}
}
