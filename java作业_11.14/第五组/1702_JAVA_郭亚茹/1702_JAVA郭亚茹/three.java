package guo;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class three {
        public static void main(String[] args) {
			 System.out.println("第三题");
			 Scanner sc=new Scanner(System.in);
			 System.out.println("请输入你的成绩：");
			 int score =sc.nextInt();
		
			 if(score>=90){
				 System.out.println("A");
				 
			}if (score>60 && score<=89){
				System.out.println("B");
				
			}if(score<60 ){
				System.out.println("C");
			}
		}
}
