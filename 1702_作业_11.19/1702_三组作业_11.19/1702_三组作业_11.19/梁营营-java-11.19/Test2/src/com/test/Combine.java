package com.test;



//��ҵ�ߣ�
//���ߣ���ӪӪ��
public class Combine {
public static void main(String[] args) {
	//��1��2��3��4��5�����������ȡ�����������г����ǵ�������ϲ����������Ļ�ϡ�
	for(int i =1;i<=5;i++){
		for(int j =1;j<=5;j++){
			if(i==j){
				continue;
			}
				
			System.out.print(i);
			System.out.println(j);
		}	
	}
}
}
