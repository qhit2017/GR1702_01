package xiajie;

public class Sum {

	public static void main(String[] args) {

		System.out.println("������1~100���ۼ�ֵ����Ҫ��������λΪ3����");

		int sum = 0;

		for (int a = 1; a <= 100; a++) {
			
			if (a % 10 != 3) {

				sum = sum + a;

			}

		}
		
		System.out.println("�����Ϊ:" + sum);

	}

}
