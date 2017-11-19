package xiaxiaoyu;

public class  PoliceDog extends Dog{
	/*
	定义一个类：警犬 并继承第一题的类：狗
    属性：最快时速
	方法：work
	*/
	
	String fastspeed;
	public PoliceDog(int leg, String color, String kind, String haircolor,
			int age, String weight, String fastspeed) {
		super(leg, color, kind, haircolor, age, weight);
		this.fastspeed = fastspeed;
	}
	void work(){
		System.out.println("咬坏蛋");
	}
}
