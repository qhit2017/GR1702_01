package com.zk.qhit.test;
//��ҵ�ģ�
//���ߣ���ӪӪ��
public class StartNumber {

	public static void main(String[] args) {
	//	�����0~10000֮����3��ͷ����
		for (int i = 1; i <10000; i++) {
			if (i/1000==3) {
				System.out.println(i);
		}if(i/100==3){
			System.out.println(i);
		}
		if(i/10==3){
			System.out.println(i);
		}
		if(i==3){
			System.out.println(i);
		}
	}
	}
}
