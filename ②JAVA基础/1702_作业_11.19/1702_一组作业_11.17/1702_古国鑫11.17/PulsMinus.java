package guguoxin;

import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月19日 下午6:59:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PulsMinus {

		//通过控制台输入一个数字，判断该数字是正数还是负数，并输出结果。
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个数字a:");
			
			int a = sc.nextInt();
			if (a<0){
				
				System.out.println("该数为负数："+a);
			}
			if (a==0){
				
				System.out.println("该数非负非正："+a);
			}
			if (a>0){
				
				System.out.println("该数为正数："+a);
			}
			sc.close();
		}

}
