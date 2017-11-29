package zengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月23日 上午8:54:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Mouse implements Animal {
	private String names;//姓名
	private String breeds;//品种
	private int leg;//腿
	private double weight;//体重

	public Mouse() {
	}

	public Mouse(String names, String breeds) {
		this.names = names;
		this.breeds = breeds;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "老鼠的吃方法";
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "老鼠的叫方法";
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getBreeds() {
		return breeds;
	}

	public void setBreeds(String breeds) {
		this.breeds = breeds;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
