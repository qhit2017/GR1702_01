package Student;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:295852280@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����8:21:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Count {
	public static void main(String[] args) {
		//һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "������6=1��2��3.����ҳ�1000���ڵ����������� 

		
		System.out.println("������:");
		for(int i =1;i<1001;i++){
			int sum =0;
		for(int j =1;j<i;j++)
			if(i%j==0)
			sum+=j;
		if(sum==i)
			System.out.println(i);
		}
		
	}

}
