package lijingjing;

import java.awt.print.Printable;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��19�� ����5:03:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Theunit {

	public static void main(String[] args) {
		int a =0;
		int i;
		
		for(i=100;i<=999;i++){
			if(6==i%10&&0==i%3){
				a++;
			}
			
		}
		System.out.println(a);
	}
}
