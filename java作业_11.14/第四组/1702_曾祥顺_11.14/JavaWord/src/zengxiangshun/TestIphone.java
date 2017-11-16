package zengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月14日 上午9:05:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestIphone {
	public static void main(String[] args) {
		Iphone s = new Iphone("荣耀9", "华为", 3900.0);
		System.out.println(s.name);
		System.out.println(s.brand);
		System.out.println(s.price);
	}

}
