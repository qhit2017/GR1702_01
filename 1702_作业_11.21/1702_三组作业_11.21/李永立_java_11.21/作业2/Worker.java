package liyongli;
/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月21日 下午7:29:39 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Worker extends Person{

	public Worker(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getContent() {
		// TODO Auto-generated method stub
		return "老师";
	}

	

	

}
