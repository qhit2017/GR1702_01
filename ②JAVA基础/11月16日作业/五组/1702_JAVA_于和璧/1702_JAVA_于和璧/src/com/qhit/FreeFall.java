package com.qhit;



public class FreeFall {
	
	public static void main(String[] args) {
		
		//һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
	    //�����£������� ��10�����ʱ�������������ף���10�η������
		
		 
			
			int a=100;//��ʼ�߶�
			
			
			int b=10;//��ش���
			int c=2;//�ڶ��η���
			double k=a;  //��������
			double hei=a/2;  //n�εķ����߶�

			while(b>1&&c<=b){
				k=k+hei*2;
				hei=hei/2;
				c++;
			}
			System.out.println("������"+k+"�ף�");
			System.out.println("�����߶�Ϊ��"+hei+"�ף�");
			
			
	}

}
