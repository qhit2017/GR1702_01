


public class Car {
	String color;
	int wheelNumber;
	float price;
	public Car(String color){
		this.color=color;
	}public Car(String color,int wheelNumber,float price){
		this. color= color;
		this. wheelNumber=wheelNumber;
		this. price=price;
	}
	
	
	public void info(){
		System.out.println("我的颜色是:"+color+"有"+wheelNumber+"个轮子,购买价格是"+ price);
	}    
	}



