/**
 * 
 */

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月16日 下午9:26:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Ball {
	public static void main(String[] args) {
		
		 //一球从50米高度自由落下。”，每次落地后反跳回原高度的一半；
		 // 再落下，求它在 第5次落地时，共经过多少米？第n次反弹多高？
		double a =50;
		double b =a/2;
		int c= 0;
		  
		for(c=2;c<=10;c++){
			a += b*2;
			b = b/2;
		}
		System.out.println("第"+c+"次落地经过多少米"+a+"米");
		System.out.println("第"+c+"次反弹多少米"+b+"米");
		
		
		
	}
	
}
