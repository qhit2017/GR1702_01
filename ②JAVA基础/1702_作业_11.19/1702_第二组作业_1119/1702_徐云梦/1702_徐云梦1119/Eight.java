import java.util.Scanner;

/**
 * 
 */

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月19日 下午5:48:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Eight {
		public static void main(String[] args) {
				int b=0;
			for(int a = 100;a<1000;a++){
				if(a%3==0 && a%10==6){
					System.out.println(a);
					b++;
				}
				
			}
			System.out.println("个位数为6且能被3整除的三位整数有 "+b+"个");
		}
}
