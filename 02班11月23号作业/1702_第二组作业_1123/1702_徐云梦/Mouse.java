/**
 * 
 */

/**
 * @author ���� :xuyunmeng
 * @date ����ʱ�䣺2017��11��23�� ����9:27:08
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Mouse implements Ianimal {

	// ����
	String name;
	String breed;
	int leg;
	private double weight;

	// �޲εĹ��췽��

	public Mouse() {
		super();
	}

	// ����Ϊ������Ʒ�ֵĹ��췽��
	public Mouse(String name, String breed) {

		this.name = name;
		this.breed = breed;
	}

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see Ianimal#getCry()
	 */
	@Override
	public String getCry() {
		// TODO Auto-generated method stub
		return null;
	}

}
