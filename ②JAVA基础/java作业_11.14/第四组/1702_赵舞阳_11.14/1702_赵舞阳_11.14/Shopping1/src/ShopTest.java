
public class ShopTest {
public static void main(String[] args) {
	System.out.println("第一题:");
	Shop a = new Shop(7,"笔记本",2.5,12,"书本");
	System.out.println("商品编号:"+a.id+"\n"
			+"商品名字:"+a.name+"\n"
			+"商品价格:"+a.price+"\n"
			+"商品型号:"+a.model+"\n"
			+"商品类别:"+a.category);
}
}
