package guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��19�� ����7:04:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Divide {

		//��1000���ڣ����ܱ������������ܱ�3��������������������ӡ��������ʹ��do whileѭ����ʵ�֡���
		public static void main(String[] args) {
			int a = 1;
			
			System.out.println("1000���ڣ����ܱ������������ܱ�3��������������Ϊ��");
			
			do {
			if(a%5==0 && a%3==0){
					
				System.out.println(a);
			}
				a++;
		} while (a<=1000);
				
	}
}
