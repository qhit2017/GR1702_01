package com.Score;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sum {
	public static void main(String[] args) {
		//2����д������ 1+3+5+7+����+99 �ĺ�ֵ��
		int sum=0;
		for (int i = 0; i < 100; i++) {
			if (i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
