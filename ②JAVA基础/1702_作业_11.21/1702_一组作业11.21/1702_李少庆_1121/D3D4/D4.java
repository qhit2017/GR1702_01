package D3D4;

import java.util.Scanner;

public class D4 {
public static void main(String[] args) {
	Scanner q=new Scanner(System.in);
	System.out.println("������һ����λ��");
	int a=q.nextInt();
	
	if (a/10000==a%10&&a/1000%10==a/10%10) {
		System.out.println(a+"Ϊ������");
	}else{
		System.out.println(a+"���ǻ�����");
	}
	
}
}
