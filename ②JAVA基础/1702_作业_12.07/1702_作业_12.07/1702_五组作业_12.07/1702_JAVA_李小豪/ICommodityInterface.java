package Com.Commodity;

import java.util.ArrayList;
import java.util.Scanner;

public interface ICommodityInterface {
	//1��������Ʒ
	void addCommodity(ArrayList<Commodity>arrayList,Scanner sc);
	//2������
	void stockCommodity(ArrayList<Commodity>arrayList,String Commodity);
	//3������
	void sellCommodity(ArrayList<Commodity>arrayList,Scanner sc);
	//����
	void infoCommodity(ArrayList<Commodity>arrayList);
	

}
