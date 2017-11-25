package zengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月23日 上午9:03:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
			Dog dog = new Dog("贝奇","藏獒");
			System.out.println(dog.getName()+"\t"+dog.getBreed());
			System.out.println(dog.cry());
			System.out.println(dog.eat());
			
			Mouse a =new Mouse("杰克","田鼠");
			System.out.println(a.getNames()+"\t"+a.getBreeds());
			System.out.println(a.cry());
			System.out.println(a.eat());
	}

}
