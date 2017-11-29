package D2TI;
/*制作人：王欣
 *制作时间：2017年11月21日下午6:56:54
 *邮箱：2408368509@qq.com
 */

public abstract class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	abstract String getContent();
	
	void say(){
		System.out.println(getContent());
	}
}
	