import java.util.Scanner;

/**
 * 
 */

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月20日 下午7:58:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Three {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("输入三个整数");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int a;

			if (y < x) {
				a = x;
				x = y;
				y = a;

			}
			if (z< x) {
				a = x;
				x = z;
				z = a;

			} 
			if (z < y) {
				a = y;
				y = z;
				z = a;

				
			}
			System.out.println("从小到大的顺序是" + x + "<" + y + "<" + z);

		}
		
}
