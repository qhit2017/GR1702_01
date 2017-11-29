package yangxueting;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月23日 上午9:03:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class For {

	public For() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<100;i++){
			sum+=i;i=i+2;
		}
		System.out.println("1~100的奇数和为："+sum);
	}
}
