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
public class three {
        public static void main(String[] args) {
			 System.out.println("������");
			 Scanner sc=new Scanner(System.in);
			 System.out.println("��������ĳɼ���");
			 int score =sc.nextInt();
		
			 if(score>=90){
				 System.out.println("A");
				 
			}if (score>60 && score<=89){
				System.out.println("B");
				
			}if(score<60 ){
				System.out.println("C");
			}
		}
}
