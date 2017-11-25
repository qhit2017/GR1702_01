/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：23 Nov 2017 6:51:32 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Mouse implements Animal {
	//创建老鼠 实现动物这个接口。
		//要求老鼠具有的属性包括：姓名、品种、几条腿、体重（属性私有） ，
		//并创建两种构造方法
		//（1 无参构造方法 2 参数为姓名、品种的构造方法
	private  String name;
	 private String breed;
	 private  int legs;
	 private  double weight  ;
	
	public Mouse() {
		super();
	}
	
	

	public Mouse(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}



	 
	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return  "偷粮食";
	}

	 
	@Override
	public String getCall() {
		// TODO Auto-generated method stub
		return  "吱吱吱";


	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}



	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}



	/**
	 * @return the legs
	 */
	public int getLegs() {
		return legs;
	}



	/**
	 * @param legs the legs to set
	 */
	public void setLegs(int legs) {
		this.legs = legs;
	}



	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}



	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	
	
	
}
