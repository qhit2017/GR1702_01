/** 
 * @author  ����: xuyunmeng
 * @date    ����ʱ�䣺2017��11��13�� ����8:34:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Wanshu {
		public static void main(String[] args) {
			//����
			for(int a =1;a<=1000;a++){
				
				int sum =0;
				for(int c =1;c<a;c++){
					if(a%c ==0){
						sum += c;
					}
				}
				if(sum==a){
					System.out.println(a);
				}

			}
			
		}
}
