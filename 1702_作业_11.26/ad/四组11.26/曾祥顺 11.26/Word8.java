/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月25日 下午1:31:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word8 {

	public static void main(String[] args) {
		for (int a = 3; a < 10000; a++) {
			if (a%3==0||a%10==6) {
				System.out.println(a);
			}
		}
	}
}
