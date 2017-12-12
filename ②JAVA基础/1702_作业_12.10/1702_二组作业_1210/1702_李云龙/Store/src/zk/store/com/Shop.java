package zk.store.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements IStore {
	public void help() {
		System.out.println("1.新增商品");
		System.out.println("2.进货");
		System.out.println("3.销售");
		System.out.println("4.参看库存");
		System.out.println("5.退出功能");
	}

	@Override
	public void addStore(ArrayList<Store> arrayList, Scanner sc) {
		String a = sc.next();
		String[] s = a.split(",");
		if (s.length != 4) {
			System.out.println("");
		} else {
			Store c = new Store(s[0], s[1], Double.parseDouble(s[2]), Integer.parseInt(s[3]));
			arrayList.add(c);
			System.out.println(c.toString());
		}

	}

	public void stockStore(ArrayList<Store> arrayList, Scanner sc) {
		for (int i = 0; i < arrayList.size(); i++) {
		System.out.println(arrayList.toArray());	
		}
	}
//进货
	public void sellStore(ArrayList<Store> arrayList,Scanner sc) {
System.out.println("请输入您要进货的商品编号");
String s = sc.next();
boolean sa = false;
for (int i = 0; i < arrayList.size(); i++) {
	String e = arrayList.get(i).getName();
	if (s.equals(e)) {
		System.out.println("请输入您要进货的数量");
		int k = sc.nextInt();
		arrayList.get(i).setQuantity(arrayList.get(i).getQuantity()+k);
		sa = true;
		
	}
	
}
if (!sa) {
	System.out.println("进货失败");
}
	}
//销售
	public void infoStore(ArrayList<Store> arrayList,Scanner sc) {
		System.out.println("请输入您要进货的商品编号");
		String s = sc.next();
		boolean as = false;
		for (int i = 0; i < arrayList.size(); i++) {
			String e = arrayList.get(i).getName();
			if (s.equals(e)) {
				System.out.println("请输入您销售的商品数量");
				int k = sc.nextInt();
				
				if (arrayList.get(i).getQuantity()>=k) {
					
					arrayList.get(i).setQuantity(arrayList.get(i).getQuantity()-k);
					as = true;
				}
				else {
					System.out.println("销售失败");
				}
				
			}		
		}	
	}

	

	

	@Override
	public void infoStore(ArrayList<Store> arrayList) {
		// TODO Auto-generated method stub
		
	}

	

	

}
