package zk.qhit.smc;

public class AddressBook {
	private String name;
	private String sex;
	private String telnum;

	public AddressBook(String name, String sex, String telnum) {
		super();
		this.name = name;
		this.sex = sex;
		this.telnum = telnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelnum() {
		return telnum;
	}

	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}

	@Override
	public String toString() {
		return "AddressBook [name=" + name + ", sex=" + sex + ", telnum="
				+ telnum + "]";
	}

}
