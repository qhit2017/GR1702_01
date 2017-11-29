package Guo;

public class Eight {
	public static void main(String[] args) {
		//输出所有10000个位数为6且同时被3整除的数
		for (int i = 3; i < 10000; i++) {
			if (i%3==0 || i%10==6) {
				System.out.println(i);
			}
		}
	}

}
