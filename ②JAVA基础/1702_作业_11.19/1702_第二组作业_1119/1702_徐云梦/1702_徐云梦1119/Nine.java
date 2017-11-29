import java.util.Scanner;

/**
 * 
 */

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月19日 下午5:57:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Nine {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("输入一个不大于10000的数字");
			int a = sc.nextInt();
			if(a<=10000){
				for(int b = 1;b<a;b++){
					if(b%7==0||b%10==7||b%100==7||b%1000==7||b/10%10==7){
						System.out.println(b);
				}
				
			}
			sc.close();
			}
			
		}
}
