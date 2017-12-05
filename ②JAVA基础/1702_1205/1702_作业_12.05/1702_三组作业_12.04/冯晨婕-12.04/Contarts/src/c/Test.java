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
				System.out.println("录入通讯录信息");
				cs.addContarts(arrayList, sc);
				break;
			case 2:
				System.out.println("显示所有通讯录信息");
				cs.infoContarts(arrayList);
			case 3:
				System.out.println("姓名搜索；请输入姓名");
				String name=sc.next();
				cs.findByName(arrayList, name);
				break;
			case 4:
				System.out.println("性别搜索；请输入性别");
				String sex = sc.next();
				cs.findBySex(arrayList, sex);
				break;
			case 5:
				System.out.println("电话搜索；请输入电话");
				String num = sc.next();
				cs.findByNum(arrayList, num);
				break;
			case 6:
				isquit=false;
				break;
			default:
				System.out.println("输入错误");
				break;
			}
		}
        System.out.println("退出系统");
	}

}
