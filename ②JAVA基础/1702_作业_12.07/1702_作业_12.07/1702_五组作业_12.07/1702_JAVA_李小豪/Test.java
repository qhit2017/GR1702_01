package Com.Commodity;

import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.OMGVMCID;

public class Test {

	public static void main(String[] args) {
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
		CommodityImplement commodityImplement = new CommodityImplement();
		Scanner sc = new Scanner(System.in);
		commodityImplement.help();
		boolean isQuit = true;
		int key ;
		while (isQuit) {
			System.out.println("请输入指令并案回车键！");
			key = sc.nextInt();
			
			switch (key) {
			case 1:
				commodityImplement.addCommodity(arrayList, sc);
				break;

			case 2:
				
				break;

			case 3:

				break;

			case 4:
				commodityImplement.infoCommodity(arrayList);;
				break;

			case 5:
				isQuit = false;
				break;

			default:
				break;
			}

		}
	}

}
