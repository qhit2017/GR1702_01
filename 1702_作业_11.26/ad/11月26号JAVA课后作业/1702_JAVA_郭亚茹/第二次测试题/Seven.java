package Guo;

public class Seven {
	public static void main(String[] args) {
		// ��1000���ڣ����ܱ�5������ͬʱ���ܱ�10��������������������ӡ��(while)
		int a = 1;

		while (a <= 1000) {

			if ((a % 5 == 0) && (a % 10 != 0)) {

				System.out.println(a);
				

			}
               a++;

		}
		
	}

}
