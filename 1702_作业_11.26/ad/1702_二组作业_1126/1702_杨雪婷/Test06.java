package yangxueting;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月26日 下午8:13:39 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test06 {

	public static void main(String[] args) {
		int count=0;
		for (int i=1; i<=1000; i++) {
			if (i%8==0) {
				count++;
		}
		}
		System.out.println(count);

	}
}
