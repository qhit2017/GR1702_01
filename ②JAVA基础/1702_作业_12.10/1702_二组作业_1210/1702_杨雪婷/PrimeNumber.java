package yangxueting;
/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��12��10�� ����8:33:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PrimeNumber {

	public static void main(String[] args) {
		boolean prime;
		for (int i = 101; i <=200; i++) {
			prime=true;
			for (int j = 2; j < i; j++) {
				
				if (i%j==0) {
					prime=false;
					break;
				}
			}
			if (prime) {
				System.out.println(i+"\t");
			}
		}
	}
}
