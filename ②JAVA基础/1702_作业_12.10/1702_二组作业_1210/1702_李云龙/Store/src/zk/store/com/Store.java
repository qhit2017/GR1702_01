package zk.store.com;

public class Store {

	private String number;
	private String name;
	private double price;
	private int quantity;
	public Store() {
		super();
	}
	public Store(String number, String name, double price,int quantity) {
		super();
		this.number = number;//商品编号
		this.name = name;//名称
		this.price = price;//价格
		this.quantity = quantity;//数量
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Store [number=" + number + ", name=" + name + ", price="
				+ price + ", quantity=" + quantity + "]";
	}
	
}
