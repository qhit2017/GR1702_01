package grade;
/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月14日 下午8:32:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Integer {
public static void main(String[] args) {
	//求整数1到100的累加值，但要求跳过各位为3的数
		System.out.println("求1到100的累加值， 但要求跳过各位为3的数");
		int sum =0;
		for(int a =1;a<=100;a++){
			if(a%10 !=3){
				sum += a;
			}
		}
	System.out.println("所求和为："+sum);
	
	
	
	
	
	
}
}
