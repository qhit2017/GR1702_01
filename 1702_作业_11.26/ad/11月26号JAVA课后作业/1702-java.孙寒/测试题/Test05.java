import java.util.Scanner;


public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("输入三个数");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
	    int a = 0;
		if (x>y) {
			x=a;
			x=y;
			y=a;
		}
		if (x>z) {
			x=a;
			z=x;
			z=a;
		}if (y>z) {
			y=a;
			y=z;
			z=a;
		}System.out.println(x+" "+y+" "+z);
	}

}
