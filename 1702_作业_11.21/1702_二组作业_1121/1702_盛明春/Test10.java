package zuoye2;

public class Test10 {
public static void main(String[] args) {
	int a=1;
	while(a<10){
		int b=1;
		while (b<=a) {
			System.out.print(b+"*"+a+"="+a*b+"\t");
			b++;
		}
		a++;
		System.out.println();
	}
	
}
}
