package com.zk.qhit.statictest;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��20�� ����8:01:55 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setName("��������");
		b1.setPrice(55.5);
		b1.getInfo();
		
		Book b2 = new Book ("��ɽ�۽�",26);
		b2.getInfo();
	}
}
