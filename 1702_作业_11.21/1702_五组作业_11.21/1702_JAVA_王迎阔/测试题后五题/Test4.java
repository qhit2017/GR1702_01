package Test01;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����5:20:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("�ھ���:");
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������10000������:");
		long N=sc.nextLong();
		if(N>10000){
			System.out.println("���ִ��ܴ���10000");
		}else {
			for(int a=1;a<N;a++){
				if(a%7==0||a/1000==7||a/100==7||a%10/10==7||a/10==7){
					System.out.println(a);
				}
			}
		}
		sc.close();
		}	

	}

