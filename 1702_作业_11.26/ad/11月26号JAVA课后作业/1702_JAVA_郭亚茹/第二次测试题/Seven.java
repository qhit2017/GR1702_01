package Guo;

public class Seven {
	public static void main(String[] args) {
		// 求1000以内，既能被5整除，同时不能被10整除的所有整数，并打印。(while)
		int a = 1;

		while (a <= 1000) {

			if ((a % 5 == 0) && (a % 10 != 0)) {

				System.out.println(a);
				

			}
               a++;

		}
		
	}

}
