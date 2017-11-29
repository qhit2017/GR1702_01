package asfsa;

public class Mouse implements IAnimal {

	private String name;
	private String variety;
	private int leg;
	private String weight;

	public Mouse() {
	}

	public Mouse(String name, String variety) {
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

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Mouse [name=" + name + ", variety=" + variety + ", leg=" + leg
				+ ", weight=" + weight + "]";
	}
}