package com.test;

//��ҵ����
//���ߣ���ӪӪ��
public abstract class Person {
	// ���ⶨ��say��������getContent�������������������Sudent��Workder�̳�Person�ࣻ��ʵ�ֳ�����ķ���getContent��ʵ�������󲢷ֱ����say��������
	// �� public abstract String getContent();
   public	abstract String getContent();

	void say() {
		getContent();
		System.out.println(getContent());
	}
}