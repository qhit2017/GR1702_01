package guguoxin;

import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��14�� ����8:53:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		int a = sc.nextInt();
	if (a>=90){
		System.out.println("A");
	}else if(90>a&&a>=60){
		System.out.println("B");
	}else if(a<60){
		System.out.println("C");
	}
		
		sc.close();
	}
}
