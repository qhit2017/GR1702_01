package com.zk.qhit.test;
//���ߣ���ӪӪ��
public class Test1 {

	public static void main(String[] args) {
		System.out.println("��ҵ�壺");
		System.out.println("\n");
		int  i =0;
		for(int j =1;j<=100;j++){
			if(!(j%10==3)){
				i  += j;
			}
		}
		System.out.println(i);
	}
}
