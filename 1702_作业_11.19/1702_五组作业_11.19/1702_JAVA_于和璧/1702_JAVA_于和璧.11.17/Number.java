package Yu;

import java.util.Scanner;

/** 
 * @author  ���� �ں��
 * @date    ����ʱ�䣺2017��11��18�� ����4:44:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Number {
		//����һ������N��N������10000�����������7�ı����Ͱ���7������
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��������10000����N:");
		
		int N = sc.nextInt();
		
		if(N>10000){
			
			System.out.println("��Ǹ��������������ֳ�����Χ��");
			
		}
		for(int a = 1;a<=N;a++){
			
			if(a/1000==7 || a/100==7 || a/10%10==7 || a%10==7 || a%7==0 ){
				
				System.out.println(a);
			}
			sc.close();
		}
		
	}

}
