package guo;
/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Mouse  implements IZoo {

	/*c.�������� ʵ�ֶ�������ӿڡ�
	 * Ҫ��������е����԰�����������Ʒ�֡������ȡ����أ�����˽�У� ��
	 * ���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ������Ʒ�ֵĹ��췽����(non-Javadoc)
	 */

	private String name;
	private String variety;
	private int leg;
	private double weight;

	public String getEat() {
		// TODO Auto-generated method stub
		return "͵����ʳ��";
	}

	public String getWow() {
		// TODO Auto-generated method stub
		return "֨֨�У�";
	}

	public Mouse() {
		
	}
	
	public Mouse(String name, String variety) {
		
		this.name = name;
		this.variety = variety;
		
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}

	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
}
