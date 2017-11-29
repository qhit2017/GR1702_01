/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月26日 下午8:54:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test8 {

	
	public static void main(String[] args) {

		System.out.println("第八题");
		for (int i = 0; i < args.length; i++) {
			if (i % 10 == 6 && i % 3 == 0) {
				System.out.println(i);
			}
		}

	}
}
