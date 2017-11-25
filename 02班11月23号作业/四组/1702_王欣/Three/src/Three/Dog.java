package Three;
/*制作人：王欣
 *制作时间：2017年11月23日下午6:59:47
 *邮箱：2408368509@qq.com
 */

public class Dog implements Animal {
	//创建狗，实现动物这个接口。要求狗具有的属性包括：
	//姓名、品种、颜色、年龄（属性私有） ，并创建两种构造方法
	//（1 无参构造方法 2 参数为姓名的构造方法）
		private String name;
		private String breed;
		private String colour;
		private int age;
		
		
		
		public String getEat() {
			// TODO Auto-generated method stub
			return "肉";
		}
		
		public String getCall() {
			// TODO Auto-generated method stub
			return "汪汪汪";
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
