package work;
/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return 
 * @function
 */
public class Five02 {
	public static void main(String[] args) {
		//用for 和 while两种方法计算1~100之间奇数的和
		//while
		int a=1;  
		int sum=0;
		while (a<100) {
			sum+=a;
		a+=2;
			
		}
		
		System.out.println(sum);
	}

}
