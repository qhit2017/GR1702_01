package com.test;

//��ҵ����
//���ߣ���ӪӪ��
public class Accumulation {
	public static void main(String[] args) {
		// 1~10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ���֣��������������
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum = sum + i;
			
			if (sum > 20) {
				System.out.println("���ӵ�"+i+"ʱ");
				System.out.println("��ʱ���ۼ�ֵΪ"+sum);
				break;
			}
			i++;
		}

	}
}
