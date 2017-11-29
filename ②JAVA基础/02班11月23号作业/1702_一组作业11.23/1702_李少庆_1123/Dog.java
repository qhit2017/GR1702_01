package animal;

public class Dog implements Animal{

	private String name;
	private String breed;
	private String colo;
	private String age;
	private String colour;
	
	
	
	
	
	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "³Ô¹·Á¸";
	}

	@Override
	public String getCall() {
		// TODO Auto-generated method stub
		return "ÍôÍôÍô";
	}

	
	
	
	
	public Dog() {
	}
	public Dog(String name) {
		this.name = name;
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	
	
	
}
