import java.util.Scanner;


public class Test03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����һ������");
		int n = sc.nextInt();
		
		if (n>10000) {
			System.out.println("������Χ");
		}else {
			if (n/10000==0&&n/1000!=0) {
				System.out.println("�����������λ��");
			}if (n/1000==0&&n/100!=0) {
				System.out.println("�����������λ��");
			}if (n/100==0&&n/10!=0) {
				System.out.println("��������Ƕ�λ��");
			}if (n/10==0) {
				System.out.println("��������Ǹ�λ��");
			}
		}
	}

}
