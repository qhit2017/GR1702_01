package com.sum;
/**
 * @author  ����  E����mai l:�̽�/�Ľ� 2564963490@QQ.com/378901749
 * @date    ����ʱ��: 2017��11��23�� ����8:54:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Sum {
	
	public static void main(String[] args) {
		int a = 1 ;
		int sum = 0;
		while(a<=100){
			if(a%2!=0){
				sum += a;
				
			}
			a++;
		}
		System.out.println(sum);
	}

}
