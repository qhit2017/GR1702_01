package WX;

import java.util.Scanner;

public class er {
	public static void main(String[] args) {
		//�ж���������С
		Scanner a = new Scanner(System.in);
		System.out.println("����������");
		double i = a.nextDouble();
		Scanner b = new Scanner(System.in);
		System.out.println("������ڶ�������");
		double j = b.nextDouble();
		if(i>j){
			System.out.println(i+"����"+j);
		}
		else if(i<j){
			System.out.println(i+"С��"+j);
		}
		else if(i==j){
			System.out.println(i+"����"+j);
			
		}
	}

}
