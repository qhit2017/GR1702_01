package D2TI;
/*�����ˣ�����
 *����ʱ�䣺2017��11��21������6:56:54
 *���䣺2408368509@qq.com
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
	