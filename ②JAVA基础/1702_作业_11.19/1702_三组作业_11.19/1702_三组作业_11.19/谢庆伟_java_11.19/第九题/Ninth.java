package FirstTest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��15�� ����7:14:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Ninth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������N����N��10000��");
		int a=sc.nextInt();
		int n=0;
		for(int i=1;i<=a;i++){
			if(i%7==0||(i/1000==7||i/100%10==7||i/10%100==7||i%10==7)){
				System.out.print(i+"\t");
				n=n+1;
			}
			if(n>15){
				System.out.println();
				n=0;
			}
		}
		sc.close();

	}

}
