package person;
//用for 和 while两种方法计算1~100之间奇数的和
public class ZuoYe5 {
public static void main(String[] args) {
	int sum=0;
	/*for(int a=1;a<=100;a++){
		if(a%2!=0){
			sum+=a;		
		}		
	}System.out.println(sum);
	*/
	
	int b=1;
	while(b<=100){
		if(b%2!=0){
			sum+=b;	
			b++;
		}		
	}System.out.println(sum);
	
	
	
	
	
}

}
