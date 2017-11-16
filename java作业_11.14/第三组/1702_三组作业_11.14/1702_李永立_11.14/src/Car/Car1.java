package Car;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月14日 下午8:58:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Car1 {
	public static void main(String[] args) {
		
		Car car = new Car("红色", 4,200000.0f,"2吨");

		System.out.println("车的颜色："+car.color);
		System.out.println("车轮的个数："+car.wheelNumber);
		System.out.println("车的价格："+car.price);
		System.out.println("车的重量："+car.weight);
	}

}
