package com.xiajie;

/**
 * @author ���� E����mai l:�̽�/�Ľ� 2564963490@QQ.com/378901749
 * @date ����ʱ��: 2017��11��23�� ����8:16:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Mouse implements IZoo {
	// �������� ʵ�ֶ�������ӿڡ�Ҫ��������е����԰�����������Ʒ�֡������ȡ����أ�����˽�У�
	// �����������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ������Ʒ�ֵĹ��췽����
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
