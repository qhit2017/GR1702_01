package zengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月18日 下午1:13:22 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word5 {
	public static void main(String[] args) {
		int a=1;
		do {if(a%5==0&&a%3==0){
			System.out.println(a);
		}
			a++;
		} while (a<=1000);
	}
}
