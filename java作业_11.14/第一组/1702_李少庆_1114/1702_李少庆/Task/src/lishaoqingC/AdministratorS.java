package lishaoqingC;

public class AdministratorS {
public static void main(String[] args) {
	CommodityS s = new CommodityS(7,"小米",2999,'s',"手机");
	System.out.println("手机牌："+s.name);
	System.out.println("编号："+s.number);
	System.out.println("价格："+s.price);
	System.out.println("型号："+s.model);
	System.out.println("类别："+s.sort);
}
}
