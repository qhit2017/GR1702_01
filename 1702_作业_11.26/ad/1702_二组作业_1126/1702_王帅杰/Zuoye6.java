package Com.qhit;

public class Zuoye6 {
public static void main(String[] args) {
	int sum = 0;
	for (int i = 1; i <= 1000; i++) {
		if (i % 8 == 0) {
			sum=sum+1;
		}
	}
	System.out.println(sum);

}
}
