/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺23 Nov 2017 6:51:32 Ntambama
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
	//�������� ʵ�ֶ�������ӿڡ�
		//Ҫ��������е����԰�����������Ʒ�֡������ȡ����أ�����˽�У� ��
		//���������ֹ��췽��
		//��1 �޲ι��췽�� 2 ����Ϊ������Ʒ�ֵĹ��췽��
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
		return  "͵��ʳ";
	}

	 
	@Override
	public String getCall() {
		// TODO Auto-generated method stub
		return  "֨֨֨";


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
