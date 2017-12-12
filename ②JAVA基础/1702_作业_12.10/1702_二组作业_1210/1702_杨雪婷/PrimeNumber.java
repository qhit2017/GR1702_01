package yangxueting;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月10日 下午8:33:47 
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
