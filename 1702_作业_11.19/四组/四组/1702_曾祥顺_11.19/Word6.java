package zengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月18日 下午1:24:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word6 {
	public static void main(String[] args) {
		int b=0;
		for (int a = 1; a <=10; a++) {
			b+=a;
			if(b>20){
				System.out.println(b);
				break;
			}
		}
	}
}
