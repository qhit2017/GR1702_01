package zengxiangshun;

import java.util.Scanner;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月14日 下午5:33:58
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩（0~100）");
		int a = sc.nextInt();
		if (a >= 90) {
			System.out.println("A");
		} else if (a < 90 && a >= 60) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		sc.close();

	}

}
