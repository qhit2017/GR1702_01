package Guo;

public class Eight {
	public static void main(String[] args) {
		//�������10000��λ��Ϊ6��ͬʱ��3��������
		for (int i = 3; i < 10000; i++) {
			if (i%3==0 || i%10==6) {
				System.out.println(i);
			}
		}
	}

}
