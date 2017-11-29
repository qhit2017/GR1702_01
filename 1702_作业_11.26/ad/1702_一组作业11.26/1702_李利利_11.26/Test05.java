import java.util.Scanner;


public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个整数是:");
		int x = sc.nextInt();
		System.out.println("输入第二个整数是:");
		int y = sc.nextInt();
		System.out.println("输入第三个整数是:");
		int z = sc.nextInt();
		
		int i = 0;
		if(x>y){
			i=x;
			x=y;
			y=i;
		}
		if(x>z){
			i=x;
			x=z;
			z=i;
		}
		if(y>z){
			i=y;
			y=z;
			z=i;
		}
		if(z>x){
			i=z;
			z=x;
			x=i;
		}
		System.out.println("由小到大是:"+(z+"<"+y+"<"+x));
	}


}
