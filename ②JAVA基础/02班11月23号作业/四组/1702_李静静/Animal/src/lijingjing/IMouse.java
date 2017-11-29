package lijingjing;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����7:46:14
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class IMouse implements IAnimal {

	private String name;
	private String variety;
	private int legs;
	private double weight;

	public IMouse() {
	}

	public IMouse(String name, String variety) {
		this.name = name;
		this.variety = variety;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	@Override
	public String toString() {
		return "IMouse [name=" + name + ", variety=" + variety + "]";
	}

}
