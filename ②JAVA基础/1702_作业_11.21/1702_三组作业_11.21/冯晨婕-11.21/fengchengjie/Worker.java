/**
 * 
 */
package fengchengjie;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：21 Nov 2017 7:23:03 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Worker extends Person{

	/**
	 * @param age
	 * @param name
	 */
	public Worker(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see fengchengjie.Person#getContent()
	 */
	@Override
	String getContent() {
		// TODO Auto-generated method stub
		return "老师";
	}

}
