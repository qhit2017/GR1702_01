
public class GetOut {
public static void main(String[] args) {
	//�ϰ벿��
	for(int a=1;a<=10;a++){
		for(int b=9;b>=a;b--){
			System.out.print(" ");
		}
		for(int b=1;b<=a;b++){
			System.out.print("*");
		}
		for(int b=1;b<a;b++){
			System.out.print("*");
		}
		System.out.println();
	}
	//�°벿��
	for(int a=1;a<=10;a++){
		for(int b=1;b<=a;b++){
			System.out.print(" ");
		}
		for(int b=9;b>=a;b--){
			System.out.print("*");
		}
		for(int b=9;b>a;b--){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
