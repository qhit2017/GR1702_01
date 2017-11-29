/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：  E-mail:2570804732@qq.com
 * @date 创建时间：16 Nov 2017 9:23:42 Ekuseni
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Ball {
//5  一球从100米高度自由落下，每次落地后反跳回原高度的一半；
  //  再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
	
	public static void main(String[] args) {
		double h=100;
		double hn=h*0.5;
		int i=0;
		for(i=2; i<=10;i++){
			h=h+hn*2;
			hn=hn*0.5;
		}
		System.out.println("第"+i+"次落地经过"+h+"米");
		System.out.println("第"+i+"次反弹"+hn+"米");
		
		
		
		
		
		
		
		 
}
}