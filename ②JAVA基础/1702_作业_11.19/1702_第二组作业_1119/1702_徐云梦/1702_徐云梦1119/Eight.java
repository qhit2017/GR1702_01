import java.util.Scanner;

/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��19�� ����5:48:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Eight {
		public static void main(String[] args) {
				int b=0;
			for(int a = 100;a<1000;a++){
				if(a%3==0 && a%10==6){
					System.out.println(a);
					b++;
				}
				
			}
			System.out.println("��λ��Ϊ6���ܱ�3��������λ������ "+b+"��");
		}
}
