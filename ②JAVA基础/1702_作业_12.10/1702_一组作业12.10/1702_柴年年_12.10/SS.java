
public class SS {

	public static void main(String[] args) {
		for (int i = 101; i < 200; i++) {
			for (int j = 101; j <= i; j++) {
				if(i%j==0&&i!=j){
					break;
				}if(i%j==0&&i==j){
					System.out.println(i);
				}
			}
		}
	}
}
