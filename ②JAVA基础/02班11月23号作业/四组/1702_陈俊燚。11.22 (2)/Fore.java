import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

import javax.swing.DefaultDesktopManager;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

//4 从键盘输入1~7的数字，如果数字是1，则输出星期一，如果数字是2，则输出星期二
//........如果数字是7,则输出星期日(用switch)
public class Fore {
public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
	System.out.print("请输入1~7的数字：");
	int number=sc.nextInt();
	switch (number) {
	case 1:
		System.out.println("今天是周一");
		break;
	case 2:
		System.out.println("今天是周二");
		break;
	case 3:
		System.out.println("今天是周三");
		break;
	case 4:
		System.out.println("今天是周四");
		break;
	case 5:
		System.out.println("今天是周五");
		break;
	case 6:
		System.out.println("今天是周六");
		break;
	case 7:
		System.out.println("今天是周日");
		break;
	}
	sc.close();
}

}
