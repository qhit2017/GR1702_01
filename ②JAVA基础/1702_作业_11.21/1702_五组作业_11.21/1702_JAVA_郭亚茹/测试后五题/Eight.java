package Guo;
/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Eight {
	public static void main(String[] args) {
		//���λ��Ϊ6���ܱ�3��������λ�����ж��ٸ���
		int sum=0;
		for (int i = 1; i <= 1000; i++) {
		
			if (i%10==6 && i%3==0) {
			sum=sum+1;
			
			}
		}
		System.out.println(sum);
	}

}
