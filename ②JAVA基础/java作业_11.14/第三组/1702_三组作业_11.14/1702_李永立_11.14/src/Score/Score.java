package Score;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��14�� ����9:44:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Score {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������ɼ���");
		int a = sc.nextInt();
		if (a>=90){
			System.out.println("A");
		}if(a>=60&&a<=89){
			System.out.println("B");
		}if(a<60){
			System.out.println("C");
		}
	}

}
