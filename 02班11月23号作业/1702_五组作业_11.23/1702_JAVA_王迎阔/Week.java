package com.qhit.wyk;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����8:48:50 
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
	        System.out.print("����������1~7(����0��������):");
	        num = a.nextInt();
	        
	        do{
	                        
	            switch(num){
	            case 0:
	                break;
	            case 1:
	                day = "�����ǣ�����һ";
	                System.out.println(day);
	                break;
	            case 2:
	                day = "�����ǣ����ڶ�";
	                System.out.println(day);
	                break;
	            case 3:
	                day = "�����ǣ�������";
	                System.out.println(day);
	                break;
	            case 4:
	                day = "�����ǣ�������";
	                System.out.println(day);
	                break;
	            case 5:
	                day = "�����ǣ�������";
	                System.out.println(day);
	                break;
	            case 6:
	                day = "�����ǣ�������";
	                System.out.println(day);
	                break;
	            case 7:
	                day = "�����ǣ�������";
	                System.out.println(day);
	                break;
	            default:
	                System.out.print("���������룬");
	                break;
	            }
	            
	            System.out.print("����������1~7(����0��������):");
	            
	            num = a.nextInt();
	        }while(num != 0);
	}

}
