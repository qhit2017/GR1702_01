package com.qhit.wyk;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月23日 上午8:48:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Week {
	public static void main(String[] args) {
		
		 int num = 0;
	        String day = "";
	        Scanner a = new Scanner(System.in);
	        System.out.print("请输入数字1~7(输入0结束程序):");
	        num = a.nextInt();
	        
	        do{
	                        
	            switch(num){
	            case 0:
	                break;
	            case 1:
	                day = "今天是：星期一";
	                System.out.println(day);
	                break;
	            case 2:
	                day = "今天是：星期二";
	                System.out.println(day);
	                break;
	            case 3:
	                day = "今天是：星期三";
	                System.out.println(day);
	                break;
	            case 4:
	                day = "今天是：星期四";
	                System.out.println(day);
	                break;
	            case 5:
	                day = "今天是：星期五";
	                System.out.println(day);
	                break;
	            case 6:
	                day = "今天是：星期六";
	                System.out.println(day);
	                break;
	            case 7:
	                day = "今天是：星期日";
	                System.out.println(day);
	                break;
	            default:
	                System.out.print("请重新输入，");
	                break;
	            }
	            
	            System.out.print("请输入数字1~7(输入0结束程序):");
	            
	            num = a.nextInt();
	        }while(num != 0);
	}

}
