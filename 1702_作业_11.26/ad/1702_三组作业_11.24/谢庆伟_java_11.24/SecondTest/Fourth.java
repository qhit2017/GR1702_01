package SecondTest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����8:24:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Fourth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ɼ���");
		int a=sc.nextInt();
		if(a>=90&&a<=100){
			System.out.println(a+"�֣�����A");
		}
		else if(a>=60&&a<90){
			System.out.println(a+"�֣�����B");
		}
		else if(a>=0&&a<60){
			System.out.println(a+"�֣�����C");
		}
		else{
			System.out.println("����ֵ������Χ��");
		}
		sc.close();

	}

}
