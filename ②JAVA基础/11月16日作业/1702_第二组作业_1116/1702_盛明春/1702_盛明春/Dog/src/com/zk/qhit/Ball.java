package com.zk.qhit;

//һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
//�����£������� ��10�����ʱ�������������ף���n�η�����ߣ�
public class Ball {
	public static void main(String[] args) {

		double a = 100;
		double b = a / 2;
		int c = 0;
		for (c = 2; c <= 10; c++) {
			a += b * 2;
			b = b / 2;
		}
		System.out.println("��" + c + "����ؾ���" + a + "��");
		System.out.println("��" + c + "�����߶�:" + b + "��");
	}
}
