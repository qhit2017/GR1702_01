package Liyongli;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��20�� ����1:18:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Sum {
	//������
	public static void main(String[] args) {
		int sum =0;
		for(int y =1; y<10; y++){
			sum =sum +y;
			if(sum>20){
				System.out.println(sum);
				break;
			}
		}
	}

}
