package animal;

public class D5 {
public static void main(String[] args) {
	int sum=0;
	for(int a=1;a<=100;a++){
		if(a%2==1){
			sum+=a;
		}
	}
	System.out.println(sum);
	
	
	int b=1;
	int sum2=0;
	while(b<=100){
		if(b%2==1){
			sum2+=b;
		}
		b++;
	}
	System.out.println(sum2);
}
}
