/**
 * 
 */
package fengchengjie;

 

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：21 Nov 2017 11:07:32 Ekuseni
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
public abstract class Person {
	/*
	 * 创建抽象类Person，并定义抽象方法getContent()返回值是字符串， 额外定义say方法调用getContent（）方法并输出；
	 * 子类Sudent、Workder继承Person类；并实现抽象类的方法getContent； 实例化对象并分别调用say（）方法 。 public
	 * abstract String getContent();
	 */
	int age;
	String name;
	 
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
		void say(){
			System.out.println(getContent());
		}
		abstract String getContent();
		
	}
			
	 

	 
	
	
	
	
	
	
	
	
	 
