package grade;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����8:12:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class grade {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("������ѧ���ĳɼ���");
	int t = sc.nextInt();
	if(t>=90&&t<=100){
		System.out.println("��ѧ���ĳɼ�ΪA");
	}else if(t>=60){
		System.out.println("��ѧ���ĳɼ�Ϊ��B");
	}else{
		System.out.println("��ѧ���ĳɼ�Ϊ��C");
	}
	sc.close();
	
	
	
}
}
