package xiajie;

public class Ball {
	
	public static void main(String[] args) {
		
		double sum = 100;
		double h = sum/2;
		
		for(int a = 1; a <10 ;a++) {
			sum += h*2;
			h=h/2;
		}
		System.out.println(sum);
		System.out.println(h);


}
}