package lishaoqing;

public class Test {
public static void main(String[] args) {
	
	PoliceDog d = new PoliceDog(4, "��ɫ","30KmÿСʱ","yellow", 5, "15KG","30KM/Сʱ");

	
	System.out.println(d.leg);
	System.out.println(d.getColour());
	System.out.println(d.getBreed());
	System.out.println(d.eyecolour);
	System.out.println(d.getWeight());
	System.out.println(d.speed);
	System.out.println(d.getAge());
	
	d.eat("����");
	d.work();
}
}
