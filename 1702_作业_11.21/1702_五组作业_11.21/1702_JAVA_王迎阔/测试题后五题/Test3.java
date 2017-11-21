package Test01;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月21日 下午5:13:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.println("第八题:");
		int i =0;
		
		for (int a = 1; a <= 1000; a++) {
			if (a % 10 == 6 &&a % 3 == 0) {
				i++;
			}
		}System.out.println("一共有"+i+"个");
	}

}
