public class User {
	String name;
	String id;

	public User(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}

	

}
