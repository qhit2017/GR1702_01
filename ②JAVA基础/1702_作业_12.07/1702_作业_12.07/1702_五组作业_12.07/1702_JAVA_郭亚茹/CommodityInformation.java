package Com.commodity;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class CommodityInformation {
	//��Ʒ��š����ơ��۸�����
   private String CommodityId;
   private String CommodityName;
   private double Commodityprice;
   private double Commoditynumber;

   
   
   

public String getCommodityId() {
	return CommodityId;
}


public void setCommodityId(String commodityId) {
	CommodityId = commodityId;
}


public String getCommodityName() {
	return CommodityName;
}


public void setCommodityName(String commodityName) {
	CommodityName = commodityName;
}


public double getCommodityprice() {
	return Commodityprice;
}


public void setCommodityprice(double commodityprice) {
	Commodityprice = commodityprice;
}


public double getCommoditynumber() {
	return Commoditynumber;
}


public void setCommoditynumber(double commoditynumber) {
	Commoditynumber = commoditynumber;
}


public CommodityInformation() {
	super();
}


public CommodityInformation(String commodityId, String commodityName,
		double commodityprice, double commoditynumber) {
	super();
	CommodityId = commodityId;
	CommodityName = commodityName;
	Commodityprice = commodityprice;
	Commoditynumber = commoditynumber;
}


@Override
public String toString() {
	return "CommodityInformation [CommodityId=" + CommodityId
			+ ", CommodityName=" + CommodityName + ", Commodityprice="
			+ Commodityprice + ", Commoditynumber=" + Commoditynumber + "]";
}
                  
    
}
