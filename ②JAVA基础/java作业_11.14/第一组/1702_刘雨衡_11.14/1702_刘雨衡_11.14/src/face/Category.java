package face;

public class Category {
	private String serial;
	String name;
	double price;
	String model;
	String category;
	
	Category(){
		
	}
	
	public Category( String  serial,String names,double prices){
		
		this.serial=serial;
		 this.name= names;
		 this.price=prices;
	}
	
	public Category( String  serial,String name,double price,String model,String category){
		
		this.serial=serial;
		this. name= name;
		this.price=price;
		this. model=model;
		this.category=category;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getSerial() {
		return serial;
}
}