/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月23日 上午9:27:08
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Mouse implements Ianimal {

	// 属性
	String name;
	String breed;
	int leg;
	private double weight;

	// 无参的构造方法

	public Mouse() {
		super();
	}

	// 参数为姓名、品种的构造方法
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
