package homework;

import java.util.Scanner;

public class xiaoshu {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("������һ��С��");
	double s =sc.nextDouble();
	System.out.println("������ڶ���С��");
	double a =sc.nextDouble();
	if(a>s){
		System.out.println("�ڶ����������һ����");
	}else{
		System.out.println("��һ��������ڶ�����");	
	}
}
}
