package com.zk;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��18�� ����12:58:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Work2 {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in); 
 		System.out.println("����������С����");
 		double a = sc.nextDouble();
 		double b = sc.nextDouble();
 		
 		if(a>b){
 			boolean c =false;
 			System.out.println("a<b���жϽ��Ϊ��"+c);
 		}else if(a<b){
 			boolean d =true;
 			System.out.println("a<b���жϽ��Ϊ:"+d);
 		}
 		
	}
}
