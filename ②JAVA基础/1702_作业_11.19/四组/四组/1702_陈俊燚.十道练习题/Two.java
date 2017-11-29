package chenjunyi;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		// 通过控制台输入两个小数，判断两个小数大小，并输出判断结果
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个小数：");
		float a = sc.nextFloat();
		System.out.println("请输入第二个小数：");
		float b = sc.nextFloat();
		if(a<b){
			System.out.println(a+"<"+b);
		}else if(b<a){
			System.out.println(b+"<"+a);
		}else{
			System.out.println("它们相等");
		}
		System.out.println();
	}
}
