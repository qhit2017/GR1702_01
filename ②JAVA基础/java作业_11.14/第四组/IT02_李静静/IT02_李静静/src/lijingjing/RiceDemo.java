package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月14日 下午5:03:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class RiceDemo {

	public static void main(String[] args) {
		Rice r = new Rice("黑米" ,"陕西","黑色");
		System.out.println("rice的kind:"+r.kind);
		System.out.println("rice的origin:"+r.origin);
		System.out.println("rice的color:"+r.color);
	}
}
