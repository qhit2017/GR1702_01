package xiaxiaoyu;

public class D10 {
	public static void main(String[] args) {
		//æ≈æ≈≥À∑®±Ì(while—≠ª∑)
		int a = 1;
		do {
			int b = 1;			
				do {
					System.out.print(a + "*" + b + "=" + a * b + "  ");
					b++;
				} while (b <= a);
			System.out.println();
			a++;
			} while (a <= 9);
	}
}
