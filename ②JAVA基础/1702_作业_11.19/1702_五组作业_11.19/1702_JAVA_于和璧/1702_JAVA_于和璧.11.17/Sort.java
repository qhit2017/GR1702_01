package Yu;
/** 
 * @author  ���� �ں��
 * @date    ����ʱ�䣺2017��11��18�� ����2:34:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sort {
	//��1,2,3,4,5����ȡ������,�г�����������ϲ����.
	public static void main(String[] args) {
		
		for(int a=1;a<=5;a++){
			for(int b=1;b<=5;b++){
				if(a==b){
					continue;
				}
				
				System.out.print(a);
				System.out.println(b);
			}
		}
	}

}
