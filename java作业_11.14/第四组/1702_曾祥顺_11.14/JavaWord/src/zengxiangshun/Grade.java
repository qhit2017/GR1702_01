package zengxiangshun;

import java.util.Scanner;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2017��11��14�� ����5:33:58
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���0~100��");
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
