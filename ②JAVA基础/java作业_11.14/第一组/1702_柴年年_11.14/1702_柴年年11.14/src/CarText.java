/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月14日 下午8:49:47
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class CarText {

	public static void main(String[] args) {

		Car un = new Car("奥斯莫比","450","跑车",1000000);
		System.out.println("车名:" + un.name);
		System.out.println("最高车速:" + un.speed);
		System.out.println("价格:"+un.price);
	}
}