package subject;
/*制作人：王欣
 *日期2017年12月6日时间下午7:26:14
 *邮箱:2408368509@qq.com
 */

public class User {
		//将员工信息封装称User类的对象。使用HashMap对象保存员工对象，
		//查找姓名为”tom”的员工信息，并遍历所有员工信息；
		//提供集合对象的初始化、添加、查找、修改、删除、遍历；
		//（提示：向HashMap中添加元素使用put(key , value)方法；
		//取值通过get(key)得到Value值。
		//遍历HashMap需要先得到集合中所有的key，再通过key得到对应的value值 。）
	String profession;
	int age;
	
	
	public User() {
		super();
	}


	public User(String profession, int age) {
		super();
		this.profession = profession;
		this.age = age;
	}


	public String getProfession() {
		return profession;
	}


	public void setProfession(String profession) {
		this.profession = profession;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [profession=" + profession + ", age=" + age + "]";
	}
	
	
}
