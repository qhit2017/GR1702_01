package qhit;
/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����8:38:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class test {
public static void main(String[] args) {
	Student st =new Student();
	System.out.println("�ͽУ�"+st.name);
	System.out.println("����"+st.age);
	System.out.print("");
	st.say();
	
	Workder te =new Workder();
	System.out.println("�����ҵ�"+te.name);
	System.out.println("����"+te.age);
	System.out.print("�ң�"+"������");
	te.say();
}
}
