
public class sum {
	public static void main(String[] args) {
		int sum=0;
		for(int a=1;a<=1000;a++){
			if(!(a%10==3)){
				sum+=a;
			}
		}
		System.out.println(sum);
	}

}
