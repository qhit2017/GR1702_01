package 李小豪;

import java.util.Scanner;

public class Text4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入你的成绩");
	int a=sc.nextInt();
	if(a>=90){
	    System.out.println("A");
}   if((a>=60)&&(a<90)){
        System.out.println("B");
}if(a<60){
	    System.out.println("c");
}
}
}