package D3D4;

public class D4t {
public static void main(String[] args) {
	for (int i = 1; i <= 10000; i++) {
		if (i>=1000) {
			if (i/1000%10==3) {
				System.out.println(i);
			}
		}else if (i>=100) {
			if (i/100%10==3) {	
				System.out.println(i);
			}
		}else if (i>=10) {
			if (i/10%10==3) {
				System.out.println(i);
			}
		}else{
			if (i%10==3) {
				System.out.println(i);
			}
		}
	}
}
}
