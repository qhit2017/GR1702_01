package com.zk;

public class Mouse implements IZoology {
	
	/*c.创建老鼠 实现动物这个接口。
	 * 要求老鼠具有的属性包括：姓名、品种、几条腿、体重（属性私有） ，
	 * 并创建两种构造方法（1 无参构造方法 2 参数为姓名、品种的构造方法）(non-Javadoc)
	 */

	private String name;//姓名
	private String variety;//品种
	private int leg;//腿
	private double weight;//体重

	public String getEat() {
		// TODO Auto-generated method stub
		return "老鼠偷吃大米！";
	}

	public String getWow() {
		// TODO Auto-generated method stub
		return "老鼠吱吱吱叫！";
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
