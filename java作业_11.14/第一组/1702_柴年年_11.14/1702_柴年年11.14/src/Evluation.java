import java.util.Scanner;


/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月13日 下午8:57:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Evluation {

	public static void main(String[] args) {
		//求整数1~100的累加值，但要求跳过各位为3的数
		int a = 1;
		int b = 0;
		for(a = 1;a <= 100;a++){
			if(a % 10 ==3){
				b = b + a;
			}
		}
		System.out.println("累加值为:"+b);
	}
}
