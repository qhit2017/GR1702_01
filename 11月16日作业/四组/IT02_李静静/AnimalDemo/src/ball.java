import java.util.Scanner;

 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月16日 下午8:53:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ball {

	/*一球从100米高度自由落下，
	 * 每次落地后反跳回原高度的一半；
	 * 再落下，求它在 第10次落地时，
     * 共经过多少米？第10次反弹多高？
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入高度");
		double h = sc.nextInt();
		System.out.println("请输入次数");
		int n =sc.nextInt();
		double hn =h/2;
		int i =0;
		for(i=2;i<n;i++){
			h=h+hn*2;
			hn =hn/2;
		}
		System.out.println("第"+i+"次落地经过"+h+"米");
		System.out.println("第"+i+"次反弹"+hn+"米");
		
		
		
		
		
		
		
		
	}
}
