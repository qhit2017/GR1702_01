package com.qhit.guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��23�� ����7:04:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Mouse implements Animal{

	String name;
	String breed;
	int leg;
	@SuppressWarnings("unused")
	private double weight;

	Mouse() {
		System.out.println("��������޲ι��췽��");
	}

	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "����";
	}

	@Override
	public String getCry() {
		// TODO Auto-generated method stub
		return "֨֨֨";
	}

	public double getWeight() {
		return 1;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
