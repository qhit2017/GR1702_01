/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月25日 下午1:57:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word10 {

	public static void main(String[] args) {
		for (int i = 1900; i <=2017; i++) {
			if ((i%400==0||i%100!=0)&&i%4==0) {
				System.out.println(i);
			}
		}
	}
}
