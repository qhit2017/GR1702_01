package A;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月18日 下午2:13:10 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class F {
	public static void main(String[] args) {
		
		System.out.println("第五题:");
		System.out.println("求1000以内既能被5整除"
				+ "又能被8整除的所有整数");
		int a=1;
		do {
			if(a%5==0 && a%8==0){
				System.out.println(a);
			}
			a++;
		} while (a<=1000);
		
	}

}
