package Guo;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Eight {
	public static void main(String[] args) {
		//求个位数为6且能被3整除的三位数共有多少个。
		int sum=0;
		for (int i = 1; i <= 1000; i++) {
		
			if (i%10==6 && i%3==0) {
			sum=sum+1;
			
			}
		}
		System.out.println(sum);
	}

}
