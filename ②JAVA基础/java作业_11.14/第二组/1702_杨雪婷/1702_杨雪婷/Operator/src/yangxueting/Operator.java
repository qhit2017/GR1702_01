package yangxueting;

import java.util.Scanner;

/** 
 * @author  E-mail:2714031169@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����9:37:43 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Operator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char A='A';
	char B='B';
	char C='C';
	System.out.println("ѧϰ�ɼ�");
	int g=sc.nextInt();
	if(g>=90){
		System.out.println(A);
	}else{
		if((g>=60)&&(g<=89)){
			System.out.println(B);
		}else{
			System.out.println(C);
		}
	}
}
}
