import java.util.Scanner;


public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����һ��������:");
		int x = sc.nextInt();
		System.out.println("����ڶ���������:");
		int y = sc.nextInt();
		System.out.println("���������������:");
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
		System.out.println("��С������:"+(z+"<"+y+"<"+x));
	}


}
