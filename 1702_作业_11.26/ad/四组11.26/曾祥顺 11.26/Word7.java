/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��25�� ����1:28:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word7 {
	public static void main(String[] args) {
		int a = 0;
		while (a<1000) {
			if (a%5==0&&a%10!=0) {
				System.out.println(a);
			}
			a++;
		}
	}
}
