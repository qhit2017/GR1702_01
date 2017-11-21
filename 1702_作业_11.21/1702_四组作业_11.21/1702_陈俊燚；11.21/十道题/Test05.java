public class Test05 {
	public static void main(String[] args) {
		System.out.println("µÚÎåÌâ");
		int sum = 0;
		int a = 15;
		do {
			if ((a % 3 == 0) && (a % 5 == 0)) {
           sum+=a;
           System.out.println(a);
			}
			a++;
		} while (a <= 1000);
	}
} 
