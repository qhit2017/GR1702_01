package com.zk;

import java.util.Scanner;

//作业五；
//作者：梁营营；
public class Ball {
	
	    public static void main(String[]args){  
	        Scanner in = new Scanner(System.in);  
	        System.out.println("请输入起始球的高度:h=");  
	        int h = in.nextInt();  
	        System.out.println("请输入反弹次数:n=");  
	        int n = in.nextInt();  
	        int k = 0;  
	          
	        do{  
	            h = h/2;  
	            n--;  
	            k++;  
	        }while(n==1);  
	        System.out.println("球一共反弹了"+k+"次,它现在的高度是:"+h);   
	    }  
	}  

