package chenjunyi;
//һ���h�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
//�����£������� ��n�����ʱ�������������ף���n�η�����ߣ�
public class Five {
public static void main(String[] args) {
	double h =1100;
	double sum =0;
	for(int n=1;n<=10;n++){
		sum+=h;
		h=h*0.5;
		if(n!=10){
			sum+=h;
		}
	}
	System.out.println(sum+",");
}
}
