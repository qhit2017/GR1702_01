package zengxiangshun;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��23�� ����9:03:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
			Dog dog = new Dog("����","����");
			System.out.println(dog.getName()+"\t"+dog.getBreed());
			System.out.println(dog.cry());
			System.out.println(dog.eat());
			
			Mouse a =new Mouse("�ܿ�","����");
			System.out.println(a.getNames()+"\t"+a.getBreeds());
			System.out.println(a.cry());
			System.out.println(a.eat());
	}

}
