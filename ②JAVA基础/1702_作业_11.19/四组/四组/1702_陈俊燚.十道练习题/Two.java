package chenjunyi;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		// ͨ������̨��������С�����ж�����С����С��������жϽ��
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��С����");
		float a = sc.nextFloat();
		System.out.println("������ڶ���С����");
		float b = sc.nextFloat();
		if(a<b){
			System.out.println(a+"<"+b);
		}else if(b<a){
			System.out.println(b+"<"+a);
		}else{
			System.out.println("�������");
		}
		System.out.println();
	}
}
