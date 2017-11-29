package chenjunyi;

//定义一个类：警犬 并继承第一题的类：狗
// 属性：最快时速     方法：work
public class PoliceDog extends Dog {
	// 属性
	double speed;

	PoliceDog(String breed, String color, int age, double weight,String EyeColor,double quantity,double speed) {
	}
//方法
	void work() {
		System.out.println("工作");
	}
}