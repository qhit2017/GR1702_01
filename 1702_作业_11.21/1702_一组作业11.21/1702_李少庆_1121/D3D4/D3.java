package D3D4;

import java.util.Scanner;

public class D3 {
public static void main(String[] args) {
	Scanner q =new  Scanner(System.in);
	
	double a=q.nextDouble();
	double b=q.nextDouble();
	double c=q.nextDouble();
	double n =0;
	if (a>b) {
		n=a;
		a=b;
		b=n;
	}
	if (a>c) {
		n=a;
		a=c;
		c=n;
	}
	if (b>c) {
		n=b;
		b=c;
		c=n;
	}
	
	System.out.println(a+"<"+b+"<"+c);
	
}
}
