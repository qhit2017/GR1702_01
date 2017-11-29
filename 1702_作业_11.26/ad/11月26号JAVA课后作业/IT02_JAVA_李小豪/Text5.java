package 李小豪;

import java.util.Scanner;

public class Text5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入i:");
	  int i=sc.nextInt();
	  System.out.println("请输入o:");
	  int o=sc.nextInt();
	  System.out.println("请输入P:");
	  int P=sc.nextInt();
	  int h=0;
	  if(i>o){
		  h=i;
		  i=o;
		  o=h;
	  }if(i>P){
		  h=i;
		  i=P;
		  P=h;
	  }if(o>P){
		  h=o;
		  o=P;
		  P=h;
	  }
	  System.out.println(i+" "+o+" "+P);
	  
	  
}
}
