package xiaxiaoyu;

public class Test {
/*
 * 创建一个测试类，实例化一个警犬对象，
 * 设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速，
 */
	public static void main(String[] args) {
		PoliceDog d = new PoliceDog(4,"蓝色","苏格兰牧羊犬","棕色",5,"15kg","一秒10米");
		System.out.println("警犬品种："+d.kind);
		System.out.println("毛的颜色："+d.getHaircolor());
		System.out.println("重量："+d.weight);
		System.out.println("年龄："+d.age);
		System.out.println("眼镜的颜色："+d.color);
		System.out.println("腿的数量"+d.leg);
		System.out.println("最快速度："+d.fastspeed);
	}
}
