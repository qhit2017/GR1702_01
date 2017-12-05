package zengxiangshun;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2004��1��5�� ����2:15:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Contacts {

	private String name;
	private String sex;
	private String tel;

	public Contacts(String name, String sex, String tel) {
		this.name = name;
		this.sex = sex;
		this.tel = tel;
	}

	public Contacts() {
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", tel=" + tel + "]";
	}

}
