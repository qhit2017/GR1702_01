package A;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��18�� ����1:33:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class A {
	public static void main(String[] args) {
		
		System.out.println("��һ��:");
		Scanner sc = new Scanner(System.in);
		System.out.println("�����:");
		int a =sc.nextInt();
		if(a>0){
			System.out.println("����Ϊ����");
		}else if(a<0){
			System.out.println("����Ϊ����");
		}else{
			System.out.println("������Ϊ������Ҳ��Ϊ����");
		}
		System.out.println();
		
	}

}
