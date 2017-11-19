 package chenjunyi;

//4  创建一个测试类，实例化一个警犬对象，设置警犬品种、毛的颜色、重量、
//年龄、眼睛颜色、腿的数量、最快时速，调用它的吃的方法和work方法
public class Test {
	public static void main(String[] args) {
		PoliceDog policedog = new PoliceDog("拉布拉多犬", "金黄色", 3, 10,"黑色",4,50);
		policedog.setBreed("拉布拉多犬");
		System.out.println("警犬品种:"+policedog.getBreed());
		policedog.setColor("金黄色");
		System.out.println("毛的颜色:"+policedog.getColor());
		policedog.setAge(3);
		System.out.println("年龄:"+policedog.getAge()+"岁");
		policedog.setWeight(10);
		System.out.println("体重:"+policedog.getWeight()+"kg");
		policedog.EyeColor  ="黑色";
		System.out.println("眼睛颜色:"+policedog.EyeColor);
		policedog.quantity=4;
		System.out.println("腿的数量:"+policedog.quantity);
		policedog.speed=50;
		System.out.println("最快时速:"+policedog.speed+"m");
		policedog.eat();
		policedog.work();
		}
	}

