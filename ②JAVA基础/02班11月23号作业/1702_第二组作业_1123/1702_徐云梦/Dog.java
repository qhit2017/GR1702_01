/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月23日 上午9:10:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog implements Ianimal {

	// 无参的构造方法
	public Dog() {

	}

	// 参数为姓名的构造方法
	public Dog(String name) {

		this.name = name;
	}

	// 属性
	String name;
	String breed;
	String colour;
	private int age;

	/*
	 * (non-Javadoc)
	 * 
	 * @see Ianimal#getEat()
	 */
	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Ianimal#getCry()
	 */
	@Override
	public String getCry() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return 3;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
