/**
 * 
 */

/**
 * @author ���� :xuyunmeng
 * @date ����ʱ�䣺2017��11��23�� ����9:10:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog implements Ianimal {

	// �޲εĹ��췽��
	public Dog() {

	}

	// ����Ϊ�����Ĺ��췽��
	public Dog(String name) {

		this.name = name;
	}

	// ����
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
