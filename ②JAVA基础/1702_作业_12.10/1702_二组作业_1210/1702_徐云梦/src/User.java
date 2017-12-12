public class User {
	String name;
	String id;
	String sex;
	
	
	public User(String name, String id, String sex) {
		super();
		this.name = name;
		this.id = id;
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", sex=" + sex + "]";
	}
	

}
