package com.bell;

public class Bell {
public static void main(String[] args) {
	double h = 100;//�߶�100��
	double hs= h/2;//��һ�ε����ĸ߶�
	 int i = 0;
	for(i=2;i<10;i++){
		h=h+hs*2;//��i����ؾ���������
		hs = hs/2;//��i�η����ĸ߶�
	}
	System.out.println("��"+i+"����ؾ���"+h+"��");
	System.out.println("��"+i+"�η���"+hs+"��");
}
}
