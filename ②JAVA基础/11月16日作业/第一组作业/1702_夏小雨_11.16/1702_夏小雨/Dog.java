package xiaxiaoyu;

public class Dog extends Animal{
	//定义一个类：狗，属性包括： 品种，毛的颜色， 年龄，重量  方法包括：叫、吃、睡觉
	  //  要求属性私有，并提供get、set方法 
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
			System.out.println("汪汪汪");
		}
		void eat(){
			System.out.println("吃狗粮");
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
