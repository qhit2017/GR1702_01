package Liyongli;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��16�� ����9:41:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Height {
	public static void main(String[] args) {
		
	
	//һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
    //�����£������� ��5�����ʱ�������������ף���5�η�����ߣ�     
	double h=100;
	double n=h/2;
	for (int t=1;t<5; t++ ){
		h+=n*2;
		n=n/2;
		
	}
	System.out.println("��100�׸��������·���5�ι�������"+h+"��");
	System.out.println("�������εķ����ĸ߶�Ϊ��"+n+"��");
	
	
	
		
	}
	
	
}
