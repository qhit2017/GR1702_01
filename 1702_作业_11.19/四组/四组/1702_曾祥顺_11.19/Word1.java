package zengxiangshun;

import java.util.Scanner;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月18日 下午12:48:44
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Word1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0){
			System.out.println("这个数是正数");
		}else{
			System.out.println("这个数是负数");
		}sc.close();
	}
}
