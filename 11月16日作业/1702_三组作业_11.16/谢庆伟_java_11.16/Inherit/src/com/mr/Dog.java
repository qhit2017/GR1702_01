package com.mr;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��15�� ����8:29:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dog extends Animal{
	private String  breed;  //Ʒ��
	private String chaetacolor;  //ë����ɫ
	private int age;  //����
	private int weight;  //����
	//����
	void bark(){
		System.out.println("�����ᡰ���������ؽ�");
	}
	//��ʳ
	void feed(){
		System.out.println("�������ڽ�ʳ......");
	}
	//˯��
	void sleep(){
		System.out.println("����˯����...zZ");
	}
	//���ĺͻ�ȡ
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getChaetacolor() {
		return chaetacolor;
	}
	public void setChaetacolor(String chaetacolor) {
		this.chaetacolor = chaetacolor;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>30||age<0){
			System.out.println("�����Ѿ�������¼������һ���Ƿ�����");
		}else{
			this.age = age;
		}
		
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight>300||weight<0.037){
			System.out.println("�����Ѿ����������¼������һ���Ƿ�����");
		}else{
			this.weight = weight;
		}
		
	}
	

}
