package guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��19�� ����7:03:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Accumulated {

		//1��10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ���֣��������������
		public static void main(String[] args) {
				
			int sum =0;
				
			for(int a =1; a<=10;a++){
					
				sum =sum+a;
					
				if(sum>20){
						
				System.out.println(sum);
						
				break;
			}
					
		}
				
	}
}
