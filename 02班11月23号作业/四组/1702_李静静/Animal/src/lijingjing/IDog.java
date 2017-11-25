package lijingjing;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��23�� ����7:36:07
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class IDog implements IAnimal {

	private String name;
	private String variety;
	private String colour;
	private int age;

	public IDog() {
	}

	public IDog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "IDog [name=" + name + ", variety=" + variety + ", colour="
				+ colour + ", age=" + age + "]";
	}

}
