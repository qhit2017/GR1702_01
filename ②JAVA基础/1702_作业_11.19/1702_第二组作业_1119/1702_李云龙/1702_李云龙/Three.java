package com.zk.qhit;

public class Three {
public static void main(String[] args) {
	/**
	 * ���λ��Ϊ6���ܱ�3��������
	 */
	int a;
	int b =0;
	System.out.println("��λ��Ϊ6���ܱ�3��������Ϊ��");
	for(a =100; a < 1000;a++){
		if(a % 3 == 0&&a%10==6){
			System.out.print(a+"�� ");
			b++;
		}
	}
	System.out.println();
	System.out.println("��λ��Ϊ6���ܱ�3������������"+b+"��");
}

}
