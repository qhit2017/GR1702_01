package yangxueting;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月23日 下午7:37:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Dog h=new Dog();
		h.setName("拉布拉多");
		h.setBreed("家犬");
		h.setColour("黄色");
		h.setAge(7.5);
		h.eat();
		h.wow();
		System.out.println();
		
		Mouse j=new Mouse();
		j.setName("汤姆");
		j.setBreed("仓鼠");
		j.setLegs(4);
		j.setWeight(1);
		j.eat();
		j.wow();
}
}