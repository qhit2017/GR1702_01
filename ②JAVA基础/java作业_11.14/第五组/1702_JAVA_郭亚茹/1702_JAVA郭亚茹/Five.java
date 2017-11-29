package guo;
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
		//5、求整数1~100的累加值，但要求跳过个位为3的数.
		//保存累加值。
		int sum=0;
		//用for 循环累加。
		for(int a=1;a<=100;a++){
			//判断个位数是否为3；如果不为3，将当前a以及sum的和重新赋值给sum.
			if(!(a%10==3)){
				
			}
			sum+=a;
			
		}
		//打印累加值。
		System.out.println(sum);
	}
	
            
	
}
