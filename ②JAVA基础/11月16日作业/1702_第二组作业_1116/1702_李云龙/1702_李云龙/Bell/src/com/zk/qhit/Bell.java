package com.zk.qhit;

public class Bell {
	public static void main(String[] args) {
		double h = 100;// �߶�100��
		double a = h / 2;// ��һ�ε����߶�
		int b = 0;
		for (b = 2; b < 10; b++) {
			h = h + a * 2;// ��b����ؾ���������
			b = b/2;// ��b�η����ĸ߶�

		}
		System.out.println("��" + a + "����ؾ���" + h + "��");
		System.out.println("��" + a + "�η���" + a + "��");
		
	}
}
