package test;

public class Staff {
	String id;
	String name;

	public Staff(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + "]";
	}

}
