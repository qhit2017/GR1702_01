package xiaxiaoyu;

public class Dog extends Animal{
	//����һ���ࣺ�������԰����� Ʒ�֣�ë����ɫ�� ���䣬����  �����������С��ԡ�˯��
	  //  Ҫ������˽�У����ṩget��set���� 
		String kind; 
		private String haircolor;
		int age;
		String weight ;
		
		
		public Dog(int leg, String color, String kind, String haircolor,
				int age, String weight) {
			super(leg, color);
			this.kind = kind;
			this.haircolor = haircolor;
			this.age = age;
			this.weight = weight;
		}
		void wow(){
			System.out.println("������");
		}
		void eat(){
			System.out.println("�Թ���");
		}
		void sleep(){
			System.out.println("zzzzz");
		}
		public String getHaircolor() {
			return haircolor;
		}
		public void setHaircolor(String haircolor) {
			this.haircolor = haircolor;
		}
		
}
