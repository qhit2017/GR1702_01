package yangxueting;

import java.util.Scanner;
//66666666666666	
//99999999999999	

public class Contain {
public static void main(String[] args) {
	//ͨ������̨����һ������N��������7�ı����Ͱ���7������
	Scanner sc=new Scanner(System.in);
	System.out.println("����һ��������10000�����֣�");
	int j=sc.nextInt();
	if(j>10000){
		System.out.println("��������ֲ��ܴ���10000");
	}else{
		for(int i =1;i<j;i++){
			if(i%7==0||i%10==7||i%100==7||i/10%10==7||i%1000==7){
				System.out.println(i);
			}
				
		}sc.close();
	}
}
}
