package com.zk.qhit;

//һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "
//����6=1��2��3
//����ҳ�1000���ڵ����������� 
public class PerfectNumber {
	public static void main(String[] args) {
		for (int a = 1; a <= 1000; a++) {
			int sum = 0;
			for (int b = 1; b < a; b++) {
				if (a % b == 0) {
					sum += b;
				}
			}
			if (sum == a) {
				System.out.println(a);
			}
		}
	}
}
