import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

import javax.swing.DefaultDesktopManager;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

//4 �Ӽ�������1~7�����֣����������1�����������һ�����������2����������ڶ�
//........���������7,�����������(��switch)
public class Fore {
public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
	System.out.print("������1~7�����֣�");
	int number=sc.nextInt();
	switch (number) {
	case 1:
		System.out.println("��������һ");
		break;
	case 2:
		System.out.println("�������ܶ�");
		break;
	case 3:
		System.out.println("����������");
		break;
	case 4:
		System.out.println("����������");
		break;
	case 5:
		System.out.println("����������");
		break;
	case 6:
		System.out.println("����������");
		break;
	case 7:
		System.out.println("����������");
		break;
	}
	sc.close();
}

}
