package c;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Contarts> arrayList = new ArrayList<Contarts>();
		ContartsSrevice cs = new ContartsSrevice();
		cs.helpinfo();
		Scanner sc = new Scanner(System.in);
		 
		
		int key;
		boolean isquit = true;
        while (isquit) {
        	key=sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("¼��ͨѶ¼��Ϣ");
				cs.addContarts(arrayList, sc);
				break;
			case 2:
				System.out.println("��ʾ����ͨѶ¼��Ϣ");
				cs.infoContarts(arrayList);
			case 3:
				System.out.println("��������������������");
				String name=sc.next();
				cs.findByName(arrayList, name);
				break;
			case 4:
				System.out.println("�Ա��������������Ա�");
				String sex = sc.next();
				cs.findBySex(arrayList, sex);
				break;
			case 5:
				System.out.println("�绰������������绰");
				String num = sc.next();
				cs.findByNum(arrayList, num);
				break;
			case 6:
				isquit=false;
				break;
			default:
				System.out.println("�������");
				break;
			}
		}
        System.out.println("�˳�ϵͳ");
	}

}
