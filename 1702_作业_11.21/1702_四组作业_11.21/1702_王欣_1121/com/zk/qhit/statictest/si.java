package com.zk.qhit.statictest;

import java.util.Scanner;

/*�����ˣ�����
 *����ʱ�䣺2017��11��21������11:19:14
 *���䣺2408368509@qq.com
 */

public class si {
	public static void main(String[] args) {
		// һ��5λ�����ж����ǲ��ǻ���������12321�ǻ�����
		// ��λ����λ��ͬ��ʮλ��ǧλ��ͬ
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����");
		int w = sc.nextInt();
		if (w / 10000 == w % 10 && w / 1000 % 10 == w / 10 % 10) {
			System.out.println(w + "�ǻ�����");
		} else {
			System.out.println(w + "���ǻ�����");
		}

	}
}
