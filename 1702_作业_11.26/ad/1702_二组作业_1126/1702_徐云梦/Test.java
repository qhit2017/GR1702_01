/**
 * 
 */

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月26日 下午4:16:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		//实例化正方形
		Square square = new Square();
		square.length=4;
		System.out.println("边长是"+square.length);
		square.getPerimeter();
		System.out.println("周长是"+square.getPerimeter());
		square.getArea();
		System.out.println("面积是"+square.getArea());
		
		//实例化梯形
		Trapezoid trapezoid = new Trapezoid();
		trapezoid.shang=2;
		System.out.println("上底是"+trapezoid.shang);
		trapezoid.xia=4;
		System.out.println("下底是"+trapezoid.xia);
		trapezoid.zuo=3;
		System.out.println("左边长是"+trapezoid.zuo);
		trapezoid.you=3;
		System.out.println("右边长是"+trapezoid.you);
		trapezoid.high=3;
		System.out.println("高是"+trapezoid.high);
		trapezoid.getPerimeter();
		System.out.println("周长是"+trapezoid.getPerimeter());
		trapezoid.getArea();
		System.out.println("面积是"+trapezoid.getArea());
		
	}

}
