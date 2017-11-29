package Student;
/** 
 * @author  作者 E-mail:295852280@qq.com
 * @date    创建时间：2017年11月13日 下午8:34:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Totalsum {
	public static void main(String[] args) {
		//求整数1~100的累加值，但要求跳过各位为3的数
		
		System.out.println("第五题:");
		int  sum =0;
		for(int i =1;i<=100;i++){
			if(!(i%10==3)){
				sum+=i;
			}
		}
		System.out.println(sum);
		}

}
