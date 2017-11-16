package lishaoqingB;

import lishaoqingA.Commodity;

public class AdministratorC {
public static void main(String[] args) {
	CommodityC s = new CommodityC(10,"小米",50);
	System.out.println("编号："+s.number);
	System.out.println("名称："+s.name);
	System.out.println("价格："+s.price);
}
}
