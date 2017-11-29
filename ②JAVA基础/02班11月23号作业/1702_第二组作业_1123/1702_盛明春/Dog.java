package person;

public class Dog implements Animal{
	public Dog() {
		
	}
	
	private String name;
	private String breed;
	private String color;
	private int age;
public Dog(String name) {
		this.name=name;
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
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String geteat() {
	// TODO Auto-generated method stub
	return "¿ÐÒ§";
}
@Override
public String getcry() {
	// TODO Auto-generated method stub
	return "ÍôÍô";
}

}
