package Liyongli;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��20�� ����3:57:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Number_2 {
	//�ھ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������10000������");
		int w = sc.nextInt();
		if(w>10000){
			System.out.println("������������������");
		}
	     if(w%7==0||1000==7||100==7||10%10==7||w%10==7 ){
			System.out.println(w);
		}

	}

}
