package A;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��18�� ����1:40:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class B {
	public static void main(String[] args) {
		
		System.out.println("�ڶ���:");
		Scanner sc =new Scanner(System.in);
		System.out.println("����������С��:");
		double a =sc.nextDouble();
		double b =sc.nextDouble();
		boolean c =true;
		if(a>b){
			System.out.println("true");
			System.out.println("a>b���жϽ��Ϊ:"+c);
		}else if(a<b){
			boolean d =false;
			System.out.println("false");
			System.out.println("a<b���жϽ��Ϊ:"+d);
		}
		
		System.out.println();
		
	}

}
