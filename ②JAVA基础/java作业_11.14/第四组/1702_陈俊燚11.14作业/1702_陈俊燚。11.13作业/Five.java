package chenjuniy;

public class Five {
	//������
	//������1~100���ۼ�ֵ����Ҫ��������λΪ3����
	public static void main(String[] args) {
		int i =0,n=0;
		for (int a =0;a<10;a++){
			for(int b =0;b<9;b++){
				if(b!=3){
					i=a*10+b;
					n+=i;
				}
			}
		}
		n+=100;
		System.out.println(n);
	}
}
