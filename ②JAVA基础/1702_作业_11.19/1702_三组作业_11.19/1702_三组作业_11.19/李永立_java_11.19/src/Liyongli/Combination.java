package Liyongli;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��20�� ����1:15:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Combination {
	public static void main(String[] args) {
		//���
	 
		for (int i =1; i<=5; i ++){
			for(int j =1 ; j<=5; j++){
				if(j==i){
					continue;
				}
				System.out.print(i);
				System.out.println(j);
			}
		}
	}

}
