package xiaxiaoyu;

public class Mouse implements Animal{

	
	String name;
	String breed;
	int leg;
	private double weight;
	
	Mouse() {
		System.out.println("�޲ι��췽��");
	}

	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	public String getEat() {
		// TODO Auto-generated method stub
		return "����";
	}

	public String getCry() {
		// TODO Auto-generated method stub
		return "jijiji";
	}

	public String getWeight() {
		// TODO Auto-generated method stub
		return null;
	}

}
