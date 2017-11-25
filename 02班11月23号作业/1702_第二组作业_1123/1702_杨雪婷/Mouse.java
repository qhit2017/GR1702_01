package yangxueting;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年11月23日 下午7:30:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Mouse implements Dongwu{

	private String name;
	private String breed;
	private double legs;
	private double weight;
	
	
	public Mouse() {
		super();
	}
	public Mouse(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public double getLegs() {
		return legs;
	}
	public void setLegs(double legs) {
		this.legs = legs;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃奶酪");
	}
	@Override
	public void wow() {
		// TODO Auto-generated method stub
		System.out.println("唧唧叫");
	}
	
	
}
