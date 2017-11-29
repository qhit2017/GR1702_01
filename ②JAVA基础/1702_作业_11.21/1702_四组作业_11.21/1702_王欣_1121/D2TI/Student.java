package D2TI;
/*制作人：王欣
 *制作时间：2017年11月21日下午7:02:20
 *邮箱：2408368509@qq.com
 */

public class Student extends Person{

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getContent() {
		// TODO Auto-generated method stub
		return "学生";
	}

}
