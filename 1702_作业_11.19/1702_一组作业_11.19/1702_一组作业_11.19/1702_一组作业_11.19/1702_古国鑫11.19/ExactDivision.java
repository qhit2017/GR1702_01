package guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��19�� ����7:07:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ExactDivision {

		//���λ��Ϊ6���ܱ�3��������λ�����ж��١�
		public static void main(String[] args) {
			
			int sum=0;
			
			for(int a =100;a<1000;a++){
				if(a%10==6 && a%3==0){
					
					sum =sum+1;
					
			}
		}
		System.out.println("��λ��Ϊ6���ܱ�3��������λ������"+sum+"����");
	}
}
