public class Work3 {

	

	public static void main(String[] args) {
		int a = 0;
		for (int i = 10000; i < 100000; i++) {
			if (i%10==6&&i%3==0) {
				a=a+1;
			}
		}
		System.out.println("一共有"+a+"个");
	}

}
