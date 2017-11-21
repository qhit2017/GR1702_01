package WX;

import java.util.Scanner;

public class er {
	public static void main(String[] args) {
		//判断两个数大小
		Scanner a = new Scanner(System.in);
		System.out.println("请输入数字");
		double i = a.nextDouble();
		Scanner b = new Scanner(System.in);
		System.out.println("请输入第二个数字");
		double j = b.nextDouble();
		if(i>j){
			System.out.println(i+"大于"+j);
		}
		else if(i<j){
			System.out.println(i+"小于"+j);
		}
		else if(i==j){
			System.out.println(i+"等于"+j);
			
		}
	}

}
