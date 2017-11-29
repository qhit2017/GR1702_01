package animal;

public class Mouse implements Animal{

	private String name;
	private String breed;
	private String legs;
	private String weight;
	
	
	public Mouse() {
	}
	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	
	
	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "≥‘ƒÃ¿“";
	}
	@Override
	public String getCall() {
		// TODO Auto-generated method stub
		return "÷®÷®÷®";
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
	public String getLegs() {
		return legs;
	}
	public void setLegs(String legs) {
		this.legs = legs;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	
	
	

}
