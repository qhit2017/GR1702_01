package Liyongli;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��19�� ����7:48:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Multiple {
	public static void main(String[] args) {
		//������
		int sum =0;
		for(int e =1; e<1000; e++){
			if(e%8==0){
				sum=sum+e;
			}
		}
		System.out.println(sum);
	}

}
