package xiajie;

import java.util.Scanner;

public class Score {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ѧ���ɼ���");
		
		 int a = sc.nextInt();
		 
		 if(a >= 90 && a <= 100){
			 System.out.println("��ѧ���ɼ�ΪA��");
			 }else if(a >= 60 && a < 90) {
				 System.out.println("��ѧ���ɼ�ΪB��");
			 }else if(a < 60 && a>=0) {
				 System.out.println("��ѧ���ɼ�ΪC��");
			 }else {
				 System.out.println("��������");
			 }
		
	}

}
