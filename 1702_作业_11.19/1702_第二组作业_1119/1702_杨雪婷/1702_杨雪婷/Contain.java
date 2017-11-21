package yangxueting;

import java.util.Scanner;
//66666666666666	
//99999999999999	

public class Contain {
public static void main(String[] args) {
	//通过控制台输入一个整数N输入所有7的倍数和包含7的数字
	Scanner sc=new Scanner(System.in);
	System.out.println("输入一个不大于10000的数字：");
	int j=sc.nextInt();
	if(j>10000){
		System.out.println("输入的数字不能大于10000");
	}else{
		for(int i =1;i<j;i++){
			if(i%7==0||i%10==7||i%100==7||i/10%10==7||i%1000==7){
				System.out.println(i);
			}
				
		}sc.close();
	}
}
}
