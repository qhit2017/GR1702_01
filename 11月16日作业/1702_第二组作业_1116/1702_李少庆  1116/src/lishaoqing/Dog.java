package lishaoqing;

public class Dog extends Animal{

	
	private String breed;
	private String colour;
	private int age;
	private String weight;
	
	


	public Dog(int leg, String eyecolour, String breed, String colour, int age,
			String weight) {
		super(leg, eyecolour);
		this.breed = breed;
		this.colour = colour;
		this.age = age;
		this.weight = weight;
	}



	void call(){
		System.out.println("ÍôÍôÍô");
	}
	void eat(String food){
		System.out.println("°®³Ô"+food);
	}
	void sleep(){
		System.out.println("ÊæÊÊµÄË¯¾õ");
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	
	
}
