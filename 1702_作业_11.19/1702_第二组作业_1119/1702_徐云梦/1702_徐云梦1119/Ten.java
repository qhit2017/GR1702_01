/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��19�� ����5:49:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Ten {
		public static void main(String[] args) {
			int a = 1;
			while(a<=9){
				int b = 1;
				while(b<=a){
					System.out.print(b+"*"+a+"="+a*b+"\t");
					b++;
					
				}
				a++;
				System.out.println();
			}		
		}
}
