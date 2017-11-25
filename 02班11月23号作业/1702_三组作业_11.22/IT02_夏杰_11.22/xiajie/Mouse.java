package com.xiajie;

/**
 * @author 作者 E——mai l:程洁/夏杰 2564963490@QQ.com/378901749
 * @date 创建时间: 2017年11月23日 上午8:16:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Mouse implements IZoo {
	// 创建老鼠 实现动物这个接口。要求老鼠具有的属性包括：姓名、品种、几条腿、体重（属性私有）
	// ，并创建两种构造方法（1 无参构造方法 2 参数为姓名、品种的构造方法）
	private String name;
	private String kind;
	private int legnumber;
	private double weight;

	/**
	 * 
	 */
	public Mouse() {
	}

	/**
	 * @param name
	 * @param kind
	 */
	public Mouse(String name, String kind) {
		this.name = name;
		this.kind = kind;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Wow() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	
}
