package com.qhit.wyk;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����9:16:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class OddNumber {
	public static void main(String[] args) {
		
		//��for �� while���ַ�������1~100֮�������ĺ�
		/*int sum=0,i=1;
		  while(i<101)
		  {sum=sum+i;i+=3;}
		  System.out.println("1��100֮�����������"+sum);
		  */
		int sum=0;
		  for(int i=1;i<101;i+=2)
		  sum=sum+i;
		  System.out.println("1��100֮�����������"+sum);
	}

}
