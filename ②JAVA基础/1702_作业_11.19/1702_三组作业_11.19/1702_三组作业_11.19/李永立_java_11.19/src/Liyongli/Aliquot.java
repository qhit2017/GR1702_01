package Liyongli;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��19�� ����7:54:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Aliquot {
	//������
	public static void main(String[] args) {
		int n=1;
		do{
			if(n%3==0&&n%5==0){
				System.out.println(n);
				
			}
			n++;
		}while(n<1000);
		
	}

}
