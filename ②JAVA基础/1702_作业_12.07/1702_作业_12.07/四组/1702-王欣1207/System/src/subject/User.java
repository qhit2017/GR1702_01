package subject;
/*�����ˣ�����
 *����2017��12��6��ʱ������7:26:14
 *����:2408368509@qq.com
 */

public class User {
		//��Ա����Ϣ��װ��User��Ķ���ʹ��HashMap���󱣴�Ա������
		//��������Ϊ��tom����Ա����Ϣ������������Ա����Ϣ��
		//�ṩ���϶���ĳ�ʼ������ӡ����ҡ��޸ġ�ɾ����������
		//����ʾ����HashMap�����Ԫ��ʹ��put(key , value)������
		//ȡֵͨ��get(key)�õ�Valueֵ��
		//����HashMap��Ҫ�ȵõ����������е�key����ͨ��key�õ���Ӧ��valueֵ ����
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
