package guo;
/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog implements IZoo{
	
	
	/*b.��������ʵ�ֶ�������ӿڡ�Ҫ�󹷾��е����԰�����
	������Ʒ�֡���ɫ�����䣨����˽�У� �����������ֹ��췽��
	��1 �޲ι��췽�� 2 ����Ϊ�����Ĺ��췽����
	*/
	
	private String   name;
	private String   variety;
	private String   colour;
	private int age;

	public String getEat() {
		// TODO Auto-generated method stub
		return "�Թ���";
	}

	public String getWow() {
		// TODO Auto-generated method stub
		return "������";
	}

	
	public Dog() {
		super();
	}

	
	public Dog(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
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
	
	

	
	
	

}
