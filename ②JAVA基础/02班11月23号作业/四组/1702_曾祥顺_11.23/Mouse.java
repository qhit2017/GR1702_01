package zengxiangshun;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��23�� ����8:54:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Mouse implements Animal {
	private String names;//����
	private String breeds;//Ʒ��
	private int leg;//��
	private double weight;//����

	public Mouse() {
	}

	public Mouse(String names, String breeds) {
		this.names = names;
		this.breeds = breeds;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "����ĳԷ���";
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "����Ľз���";
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
