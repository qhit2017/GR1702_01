package yangxueting;

public class PerfectNumber {

	public static void main(String[] args) {
		for(int h=1;h<=1000;h++){
			int cat=0;
			for (int j=1;j<h;j++){
				if(h%j==0){
					cat+=j;
				}
			}
			if(cat==h){
				System.out.println(h);
			}
		}
	}
}
