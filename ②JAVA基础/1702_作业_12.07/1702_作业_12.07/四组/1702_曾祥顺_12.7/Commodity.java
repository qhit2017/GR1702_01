package kaoshi3;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��12��6�� ����6:23:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Commodity {

	private String number;//���
	private String name;//����
	private int price;//��Ǯ
	private int amount;//����
	public Commodity(String number, String name, int price, int amount) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Commodity [number=" + number + ", name=" + name + ", price="
				+ price + ", amount=" + amount + "]";
	}
	
	
}
