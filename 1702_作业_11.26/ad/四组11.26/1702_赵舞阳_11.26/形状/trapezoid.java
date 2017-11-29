/*
 * c.创建梯形，实现形状这个接口。要求梯形具有的
 * 属性包括：上边长、下边长、高、周长、面积（属
 * 性私有） ，并创建两种构造方法（1 无参构造方法
 *  2 参数为上边长、下边长的构造方法）
 */
public class trapezoid implements Shape {
	private int OnLong;// 上边长
	private int InLong;// 下边长
	private int tall;// 高
	private int perimeter;// 周长
	private int area;// 面积

	public void perimeter() {
		System.out.println("我是无参构造方法");
	}

	public void area() {
		System.out.println("我是无参构造方法");
	}

	public trapezoid(int onLong, int inLong) {
		super();
		OnLong = onLong;
		InLong = inLong;
	}
}
