package Com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		ArrayList< CommodityInformation> arrayList=new ArrayList<CommodityInformation>();
		CommodityInformationImpelement commodityInformationImpelement=new CommodityInformationImpelement();
		Scanner sc=new Scanner(System.in);
		commodityInformationImpelement.help();
		
		boolean isquit=true;
		
		while (isquit) {
			System.out.println("���������ָ����س���");
			String key = sc.next();
		switch (key) {

		case "add":
			System.out.println("��������Ҫ��ӵ���Ʒ���ƣ�");
			commodityInformationImpelement.addCommodityInformation(arrayList, sc);
			break;
		case "get":
			
			commodityInformationImpelement.getCommodityInformation(arrayList, sc);
			break;
		case "sell":
		
			commodityInformationImpelement.sellCommodityInformation(arrayList, sc);
			break;
		case "info":
			System.out.println("��������Ҫ����������");
			commodityInformationImpelement.infoCommodityInformation(arrayList, sc);
			break;
		case "exit":
	isquit=false;
			break;

		default:
			System.out.println("�Բ����������ָ��û�ã����������룡");
			break;
		}
		
		}
		System.out.println("�ټ���");
	}

}
