package face;

public class Sum {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		for (a = 1; a < 1000; a++) {
				c = 0;
			for (b = 1; b < a; b++) {

				if (a % b == 0) {
					
					c=c+b;

	}
	}	
			if (c == a ) {

				System.out.println(c);
	}
	}
	}
}
