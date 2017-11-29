package option;

public class Integer {
public static void main(String[] args) {
	//求整數1~100的累加值，但要逃過個位為三的數
	System.out.println("求整數1~100的累加值，但要逃過個位為三的數");
	int sum = 0;
	for(int a = 1;a<=100;a++){
		if(a%10 !=3 ){
			sum += a;
		}
	}
	System.out.println("所求和為："+sum);
}
}
