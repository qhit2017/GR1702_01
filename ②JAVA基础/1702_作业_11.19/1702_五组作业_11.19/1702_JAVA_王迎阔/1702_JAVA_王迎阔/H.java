package A;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��18�� ����2:47:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class H {
	public static void main(String[] args) {
		System.out.println("�ڰ���:");
		Scanner sc=new Scanner(System.in);
		
		int a;
		int b=1;
		for(a=106;a<996;a+=10){
			if(a%3==0){
				b=a+b;
			}
			System.out.println(a);
		}
		
		sc.close();
	}

}
