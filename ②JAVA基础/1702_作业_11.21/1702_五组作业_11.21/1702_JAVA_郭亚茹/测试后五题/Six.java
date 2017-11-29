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
public class Six {
	public static void main(String[] args) {
		//1至10之间的整数相加，得到累加值大于20的当前数字，将该数字输出。
		int sum=0;
		for (int i = 1; i <=10; i++) {
			sum=sum+i;
			if (sum>20) {
				System.out.println(i);
				break;
			}
			
		}
		
	}

}
