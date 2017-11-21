
public class Six {
	public static void main(String[] args) {
		int a =0;
		int sum =0;
		while(a<=10){
			sum=sum+a;
			if(sum>20){
				System.out.println(a);
				break;
			}
			a++;
		}	
	}
}
