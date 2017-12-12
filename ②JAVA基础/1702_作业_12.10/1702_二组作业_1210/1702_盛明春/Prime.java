package test;

public class Prime {
public static void main(String[] args) {
	boolean isprime;
	for (int i = 101; i <= 200; i++) {
		isprime=true;
		for (int j = 2; j < i; j++) {
			if (0==i%j) {
				isprime=false;
				break;
			}
		}
		if (isprime) {
			System.out.println(i+"\t");
		}
	}
}
}
