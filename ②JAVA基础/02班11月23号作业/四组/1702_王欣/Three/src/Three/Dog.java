package Three;
/*�����ˣ�����
 *����ʱ�䣺2017��11��23������6:59:47
 *���䣺2408368509@qq.com
 */

public class Dog implements Animal {
	//��������ʵ�ֶ�������ӿڡ�Ҫ�󹷾��е����԰�����
	//������Ʒ�֡���ɫ�����䣨����˽�У� �����������ֹ��췽��
	//��1 �޲ι��췽�� 2 ����Ϊ�����Ĺ��췽����
		private String name;
		private String breed;
		private String colour;
		private int age;
		
		
		
		public String getEat() {
			// TODO Auto-generated method stub
			return "��";
		}
		
		public String getCall() {
			// TODO Auto-generated method stub
			return "������";
		}
		
		
		
		public Dog(String name) {
			super();
			this.name = name;
		}
		public Dog() {
			super();
		}
		
		
		
		public String getBreed() {
			return breed;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setBreed(String breed) {
			this.breed = breed;
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
