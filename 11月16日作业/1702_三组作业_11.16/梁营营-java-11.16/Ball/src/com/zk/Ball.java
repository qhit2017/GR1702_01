package com.zk;

import java.util.Scanner;

//��ҵ�壻
//���ߣ���ӪӪ��
public class Ball {
	
	    public static void main(String[]args){  
	        Scanner in = new Scanner(System.in);  
	        System.out.println("��������ʼ��ĸ߶�:h=");  
	        int h = in.nextInt();  
	        System.out.println("�����뷴������:n=");  
	        int n = in.nextInt();  
	        int k = 0;  
	          
	        do{  
	            h = h/2;  
	            n--;  
	            k++;  
	        }while(n==1);  
	        System.out.println("��һ��������"+k+"��,�����ڵĸ߶���:"+h);   
	    }  
	}  

