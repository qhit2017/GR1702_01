package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月14日 下午6:19:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Cumulative {
/*求整数1~100的累加值，
 * 但要求跳过各位为3的数
 */
	public static void main(String[] args) {
		int sum =0;
		for(int i =1;i<=100;i++){
			if(!(3==i%10)){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
