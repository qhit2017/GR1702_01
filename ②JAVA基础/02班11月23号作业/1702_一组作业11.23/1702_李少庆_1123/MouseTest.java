package animal;

public class MouseTest {
public static void main(String[] args) {
	
	Mouse x=new Mouse("小白","仓鼠");
	x.setWeight("1kg");
	x.setLegs("4");
	System.out.println("昵称："+x.getName());
	System.out.println("几条腿："+x.getLegs());
	System.out.println("体重："+x.getWeight());
	System.out.println("品种："+x.getBreed());
	
	System.out.println(x.getEat());
	System.out.println(x.getCall());
	
}
}
