package yangxueting;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月26日 下午9:00:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class StartNumber {

	public static void main(String[] args) {
		for (int i = 0; i <= 10000; i++) {
			if (i>=0&&i<10&&i/1==3) {
				System.out.println(i);
			}else if (i>=10&&i<100&&i/10==3) {
				System.out.println(i);
			}else if (i>=100&&i<1000&&i/100==3) {
				System.out.println(i);
			}else if (i>=1000&&i<=10000&&i/1000==3) {
				System.out.println(i);
			}
		}
	}
}
