package com.test;



//作业七；
//作者：梁营营；
public class Combine {
public static void main(String[] args) {
	//从1、2、3、4、5这五个数任意取出两个数，列出他们的所有组合并且输出到屏幕上。
	for(int i =1;i<=5;i++){
		for(int j =1;j<=5;j++){
			if(i==j){
				continue;
			}
				
			System.out.print(i);
			System.out.println(j);
		}	
	}
}
}
