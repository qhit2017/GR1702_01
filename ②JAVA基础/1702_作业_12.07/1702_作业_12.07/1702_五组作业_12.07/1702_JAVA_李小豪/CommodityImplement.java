package Com.Commodity;

import java.util.ArrayList;
import java.util.Scanner;

public class CommodityImplement implements ICommodityInterface {
	void help(){
		System.out.println("----商品帮助系统----");
		System.out.println("【1】新增商品请输入1");
		System.out.println("【2】进货请输入2");
		System.out.println("【3】销售请输入3");
		System.out.println("【4】参看库存请输入4");
		System.out.println("【5】退出功能请输入5");
		
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String string = sc.next();
		String[]a=string.split(",");
		if (a.length!=4) {
			System.out.println("对不起！你输入的格式不正确，请重新输入，谢谢！");
			
			
		} else {
			Commodity e = new Commodity(a[0], a[1], Double.parseDouble(a[2]),  Double.parseDouble(a[3]));
			arrayList.add(e);
			System.out.println(arrayList.toString());
		}

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, String Commodity) {
		

	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		

	}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
			
		}
		

	}

}
