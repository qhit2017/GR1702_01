package xiajie;

public class Test {
	public static void main(String[] args) {
		//警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速，
		PoliceDog d = new PoliceDog(4,"蓝","哈士奇","黑白相间",5,"50kg","50km/h");
		
		d.eat();
		d.work();
		
		System.out.println("警犬品种:"+d.kinds);
		System.out.println("眼睛颜色:"+d.eyescolor);
		System.out.println("毛的颜色:"+d.gethaircolor());
		System.out.println("年龄:"+d.age);
		System.out.println("重量:"+d.weight);
		System.out.println("最快时速:"+d.speed);
		
	}

}
