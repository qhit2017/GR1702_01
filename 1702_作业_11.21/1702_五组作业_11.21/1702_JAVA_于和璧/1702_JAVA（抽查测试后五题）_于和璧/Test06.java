package com.qhit;

public class Test06 {
	//��дJAVA����1��10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ���֣������������
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int a=1;a<=10;a++){
			
			sum+=a;
			
			if(sum>20){
				
				System.out.println("������Ϊ��"+a);
				
				break;
			}
			
		}
	}

}
