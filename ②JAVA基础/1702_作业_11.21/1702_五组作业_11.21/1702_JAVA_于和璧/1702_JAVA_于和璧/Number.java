package Test4;

import java.util.Scanner;
  //������
public class Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ����λ����");
		
		int a = sc.nextInt();
		if(a/10000==a%10 && a%10000/1000==a%100/10){
			
			System.out.println(a+"�ǻ�����");
		}else{
			
			System.out.println(a+"���ǻ�����");
		}
		sc.close();
	}
}
