package number;

public class Number {

	public static void main(String[] args) {
		for(int i=1;i<=10000;i++){
			if(i/1000==3||(i/100%10==3&&i<1000)||(i/10%10==3&&i<100)||(i%10==3&&i<10)){
				System.out.println(i);
			}
		}
	}
}
