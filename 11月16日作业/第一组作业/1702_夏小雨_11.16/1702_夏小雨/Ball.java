package xiaxiaoyu;

import java.util.Scanner;

public class Ball {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������HΪ����");
		double H = sc.nextInt();
		double hn = H / 2; 
		
		int i = 0;
		System.out.println("������NΪ����");
		int N = sc.nextInt();
		for (i = 1;i< N;i ++){
		H = H + hn * 2;    
		hn = hn / 2;      
		}
		System.out.println("��" + i + "����ؾ���" + H +"��"); 
		System.out.println("��" + i + "�η���" + hn + "��");
}
}