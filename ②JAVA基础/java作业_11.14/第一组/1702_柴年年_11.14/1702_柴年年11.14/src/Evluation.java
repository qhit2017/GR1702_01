import java.util.Scanner;


/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����8:57:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Evluation {

	public static void main(String[] args) {
		//������1~100���ۼ�ֵ����Ҫ��������λΪ3����
		int a = 1;
		int b = 0;
		for(a = 1;a <= 100;a++){
			if(a % 10 ==3){
				b = b + a;
			}
		}
		System.out.println("�ۼ�ֵΪ:"+b);
	}
}
