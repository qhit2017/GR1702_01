package guo;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class FreeFall {
	public static void main(String[] args) {
		//  һ���h�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
	    //   �����£������� ��n�����ʱ�������������ף���n�η�����ߣ�
		Scanner sc=new Scanner(System.in);
		System.out.println("��������ʼ�ĸ߶�:a=");
    	int a=sc.nextInt();
    	System.out.println("�����뷴���Ĵ�����b=");
    	int b=sc.nextInt();
    	int c=0;
    	double t=1;
	
   do{
	   t=t/2;
	   
       b--;
       c++;
  }while(b>1);
   t=a*t/2;
   c=c+1;
   System.out.println("��һ��������"+c+"��,�����ڵĸ߶��ǣ�"+t);
} 
}