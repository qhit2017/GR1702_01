package com.zk.qhit;

public class MultiplicaTion {
public static void main(String[] args) {
	
int a =1;
while (a<=9) {
	int b = 1;
	while (b<=a) {
		System.out.print(b+"*"+a+"="+b*a+"\t");
		b++;
	}
	a++;
	System.out.println();
}

}
}
