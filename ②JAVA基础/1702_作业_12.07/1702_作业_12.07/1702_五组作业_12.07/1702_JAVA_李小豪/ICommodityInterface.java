package Com.Commodity;

import java.util.ArrayList;
import java.util.Scanner;

public interface ICommodityInterface {
	//1、新增商品
	void addCommodity(ArrayList<Commodity>arrayList,Scanner sc);
	//2、进货
	void stockCommodity(ArrayList<Commodity>arrayList,String Commodity);
	//3、销售
	void sellCommodity(ArrayList<Commodity>arrayList,Scanner sc);
	//查找
	void infoCommodity(ArrayList<Commodity>arrayList);
	

}
