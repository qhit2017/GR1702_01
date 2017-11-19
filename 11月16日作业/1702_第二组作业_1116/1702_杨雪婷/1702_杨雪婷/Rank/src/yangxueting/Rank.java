package yangxueting;

import java.util.Scanner;

//66666666666666	
//99999999999999	

public class Rank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一位整数:");
		int g=sc.nextInt();
		System.out.println("请输入二位整数:");
		int h=sc.nextInt();
		System.out.println("请输入三位整数:");
		int j=sc.nextInt();
		System.out.println("请输入四位整数:");
		int k=sc.nextInt();
		int l=0;
		if(g>h){
			l=g;g=h;h=l;
		}
		if(g>j){
			l=g;g=j;j=l;
		}
		if(g>k){
			l=g;g=k;k=l;
		}
		if(h>j){
			l=h;h=j;j=l;
		}
		if(h>k){
			l=h;h=k;k=l;
		}
		if(j>k){
			l=j;j=k;k=l;
		}
		System.out.println("从大到小的顺序是："+k+"\t"+j+"\t"+h+"\t"+g);
		sc.close();
	}
}
