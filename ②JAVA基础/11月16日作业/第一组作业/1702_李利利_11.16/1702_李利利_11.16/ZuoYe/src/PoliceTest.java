
public class PoliceTest {
     public static void main(String[] args) {
		PoliceDog  police =new PoliceDog ();
		police.legs = 4;
		System.out.println("腿的数量:"+police.legs );
		police.eyecolor="黑色";
		System.out.println("眼睛的颜色是"+police.eyecolor);
		police.breed="牧羊犬";
		System.out.println("狗的品种是:"+police.breed);
		police.colour="白色";
		System.out.println("狗毛的颜色是:"+police.colour);
		police.setAge(2);
		System.out.println("年龄是:"+police.getAge());
		police.weight=60;
		System.out.println("体重是:"+police.weight);
		police.speed=3.5;
		System.out.println("时速是:"+police.speed);
		
		police.howl();
		police.eat();
		police.sleep();
		
		police.work();
	}
}
