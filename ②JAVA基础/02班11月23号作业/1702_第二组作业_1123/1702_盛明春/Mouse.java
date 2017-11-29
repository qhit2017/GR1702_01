package person;

public class Mouse implements Animal{

	@Override
	public String geteat() {
		// TODO Auto-generated method stub
		return "¿ÐÒ§";
	}

	@Override
	public String getcry() {
		// TODO Auto-generated method stub
		return "Ö¨Ö¨";
	}
	private String name;
	private String breed;
	private int leg;
	private double weight;
	public Mouse(){
		
	}
public Mouse(String name,String breed){
		this.name=name;
		this.breed=breed;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBreed() {
	return breed;
}

public void setBreed(String breed) {
	this.breed = breed;
}

public int getLeg() {
	return leg;
}

public void setLeg(int leg) {
	this.leg = leg;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

}
