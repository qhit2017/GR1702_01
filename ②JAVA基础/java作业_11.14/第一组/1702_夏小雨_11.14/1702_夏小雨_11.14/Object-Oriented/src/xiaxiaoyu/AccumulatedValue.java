package xiaxiaoyu;

public class AccumulatedValue {
	public static void main(String[] args) {
		int a = 0;
		for (int b =1;b<=100;b++){
			if(b%10==3)
				continue ;
		a=a+b;
		}
		System.out.println(a);
	}
}
