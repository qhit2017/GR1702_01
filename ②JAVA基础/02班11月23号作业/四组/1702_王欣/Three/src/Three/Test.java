package Three;
/*制作人：王欣
 *制作时间：2017年11月23日下午7:10:44
 *邮箱：2408368509@qq.com
 */

public class Test {
	public static void main(String[] args) {
		Dog i = new Dog("小黄");
		i.setAge(2);
		i.setBreed("杜宾犬");
		i.setColour("白色");
		System.out.println(i.getName());
		System.out.println(i.getBreed());
		System.out.println(i.getAge());
		System.out.println(i.getCall());
		System.out.println(i.getColour());
		System.out.println(i.getEat());

		System.out.println("\t");
		
		Mouse j = new Mouse("杰瑞","老鼠");
		j.setLegs(4);
		j.setWeight(1);
		
		System.out.println(j.getName());
		System.out.println(j.getBreed());
		System.out.println(j.getCall());
		System.out.println(j.getEat());
		System.out.println(j.getWeight());
		System.out.println(j.getLegs());
		
		
	}
	
}
