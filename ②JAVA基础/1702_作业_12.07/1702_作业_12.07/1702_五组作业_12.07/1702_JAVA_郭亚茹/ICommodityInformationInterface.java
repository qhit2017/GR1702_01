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
public interface ICommodityInformationInterface {
	//1��������Ʒ
	void addCommodityInformation(ArrayList<CommodityInformation>arrayList,Scanner sc);
	//2������
	void getCommodityInformation(ArrayList<CommodityInformation>arrayList,Scanner sc);
	//3������
	void sellCommodityInformation(ArrayList<CommodityInformation>arrayList,Scanner sc);
	//4������
	void infoCommodityInformation(ArrayList<CommodityInformation>arrayList,Scanner sc);
}
