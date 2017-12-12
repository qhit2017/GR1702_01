
public class Prime {
	public static void main(String[] args) {
		boolean isPrime;
		for (int i = 101; i <= 200; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				System.out.println(i+"\t");
			}
			
		}
	}

}
