package com.mr;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��15�� ����9:13:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PoliceDogtest {

	public static void main(String[] args) {
		PoliceDog tq=new PoliceDog();
		tq.setBreed("�¹�����Ȯ");
		tq.setChaetacolor("�ڻ�ɫ");
		tq.setWeight(18);
		tq.setAge(5);
		tq.eyescolor="��ɫ";
		tq.legsnum=4;
		tq.fastspeed=26.04;
		System.out.println("Ʒ�֣�"+tq.getBreed());
		System.out.println("ë����ɫ��"+tq.getChaetacolor());
		System.out.println("������"+tq.getWeight()+"kg");
		System.out.println("���䣺"+tq.getAge()+"��");
		System.out.println("�۾���ɫ��"+tq.eyescolor);
		System.out.println("��֫���������"+tq.legsnum);
		System.out.println("���ʱ�٣�"+tq.fastspeed+"km/hour");
		tq.feed();
		tq.work();

	}

}
