/** 
 * @author  ���� �ں��
 * @date    ����ʱ�䣺2017��11��17�� ����9:39:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Multiple {
			//��1000��������8�ı���֮��
	
	public static void main(String[] args) {
		
		int a =1;
		int sum = 0;
		
		while(a<=1000){
			
			if(a%8==0){
				
				sum = sum+a;
			}
			a++;
		}
		System.out.println("1000�������е�8�ı���֮��Ϊ��"+sum);
	}
}
