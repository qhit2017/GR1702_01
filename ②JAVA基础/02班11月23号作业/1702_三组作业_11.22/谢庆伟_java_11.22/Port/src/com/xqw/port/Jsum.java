package com.xqw.port;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����9:32:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Jsum {

	public static void main(String[] args) {
		System.out.println("�塢��for �� while���ַ�������1~100֮�������ĺ�\n");
		//For
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2==1){
				sum=sum+i;
			}
		}
		System.out.println("Forѭ������1~100֮�������ĺ���"+sum);
		//While
		int a=1;
		sum=0;
		while(a<=100){
			if(a%2==1){
				sum=sum+a;
			}
			a++;
		}
		System.out.println("\nWhileѭ������1~100֮�������ĺ���"+sum);

	}

}
