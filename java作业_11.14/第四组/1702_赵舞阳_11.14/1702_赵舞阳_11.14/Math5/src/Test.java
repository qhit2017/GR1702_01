//5、求整数1~100的累加值，但要求跳过各位为3的数
public class Test {
public static void main(String[] args) {
	int a = 0,b = 0;
	for(int c =0;c<10;c++){
		for(int d = 0;d<9;d++){
			if (d != 3){
				a=c*10+d;
				b+=a;
			}
		}
	}
	b+=100;
	System.out.println(b);
}
}
