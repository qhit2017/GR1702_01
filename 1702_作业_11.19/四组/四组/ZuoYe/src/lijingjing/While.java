package lijingjing;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��19�� ����4:32:02 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class While {

	 public static void main(String[] args) {
		int g =1;
		do{
			if(0==g%5&&0==g%3){
				System.out.println(g);
			}
			g++;
		}while(g<=1000);
	}
}
