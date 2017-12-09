package Com.Commodity;

public class Commodity {
	// ��Ʒ��š����ơ��۸�����
	private String CommodityId;
	private String CommodityName;
	private double CommodityPrice;
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

	public double getCommodityPrice() {
		return CommodityPrice;
	}

	public void setCommodityPrice(double commodityPrice) {
		CommodityPrice = commodityPrice;
	}

	public double getCommoditynumber() {
		return Commoditynumber;
	}

	public void setCommoditynumber(double commoditynumber) {
		Commoditynumber = commoditynumber;
	}

	public Commodity() {

	}

	public Commodity(String commodityId, String commodityName,
			double commodityPrice, double commoditynumber) {

		CommodityId = commodityId;
		CommodityName = commodityName;
		CommodityPrice = commodityPrice;
		Commoditynumber = commoditynumber;
	}

	@Override
	public String toString() {
		return "Commodity [CommodityId=" + CommodityId + ", CommodityName="
				+ CommodityName + ", CommodityPrice=" + CommodityPrice
				+ ", Commoditynumber=" + Commoditynumber + "]";
	}

}
