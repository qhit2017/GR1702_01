package com.qhit;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����8:10:03
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Bell {
	public static void main(String[] args) {
		double t = 200;
		double ts = t / 2;
		int i = 0;
		for (i = 2; i < 10; i++) {
			t = t + ts * 2;
			ts = ts / 2;
		}
		System.out.println("��" + i + "����ؾ���" + t + "��");
		System.out.println("��" + i + "�η����߶�Ϊ��" + ts + "��");
		
	}
}
