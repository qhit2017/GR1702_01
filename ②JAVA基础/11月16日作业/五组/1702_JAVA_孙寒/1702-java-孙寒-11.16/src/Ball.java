import java.util.Scanner;

//һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
//�����£������� ��10�����ʱ�������������ף���n�η�����ߣ�
public class Ball {
	public static void main(String[] args) {
		
		int a=100;
		int b=10;//���ش���
		int v=2;
		double c=a;
		double d=a/2;
		
		while(a>1&&v<=b){
			c=c+d*2;
			d=d/2;
			v++;
		}
		System.out.println("������"+c+"��");
		System.out.println("�����߶�Ϊ"+c+"��");
	}

}
