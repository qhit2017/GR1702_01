package xiaxiaoyu;

import java.util.Scanner;

public class D3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("������һ��������10000����");
	int N = sc.nextInt();
	if (N<=10000) {
		if (N/10000==1) {
			System.out.println("������5λ��");
		} else if(N/1000==1){
System.out.println("������4λ��");
		}else if (N/100==1) {
			System.out.println("������3λ��");
		}
		else if (N/10==1) {
			System.out.println("������2λ��");
		}
		else if (N/1==1) {
			System.out.println("������1λ��");
		}
	}
}
}
