package guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��14�� ����8:56:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {

		Category p = new Category();

		System.out.println(p);
		System.out.println();

		Category a = new Category("007", "�ʼǱ�", 11);

		System.out.println(a.getSerial());
		System.out.println(a.name);
		System.out.println(a.price);

		System.out.println();

		Category s = new Category("007", "�ʼǱ�", 11, "����", "�ľ�");

		System.out.println("����Ʒ�ı���ǣ�"+s.getSerial());
		System.out.println("����Ʒ�������ǣ�"+s.name);
		System.out.println("����Ʒ�ļ۸��ǣ�"+s.price);
		System.out.println("����Ʒ��Ʒ���ǣ�"+s.model);
		System.out.println("����Ʒ������ǣ�"+s.category);
	}
}
