package zengxiangshun;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��23�� ����6:36:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Person {

	abstract  String getContent();
	void say(){
		this.getContent();
	}
}
