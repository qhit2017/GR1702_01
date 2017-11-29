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
public class Five {
	public static void main(String[] args) {
	//5.用for 和 while两种方法计算1~100之间奇数的和	
		//for循环
		int sum=0;
		for (int i = 0; i <100; i++) {
			
		if (i%2!=0) {
			sum+=i;
			
		}
		}
	System.out.println(sum);
	}
	
}
