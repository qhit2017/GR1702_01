package zengxiangshun;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��14�� ����5:26:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestProduct {

	public static void main(String[] args) {
		//���������� 
		Product x = new Product();
		System.out.println(x);
		
		
		System.out.println();
		//����������
		Product a = new Product(5,"�Ӷ౦",3);
		
		
		System.out.println();
		//���������
		Product s = new Product(5,"�Ӷ౦",3,"��װ","����");
		System.out.println("��ţ�"+s.id);
		System.out.println("���ƣ�"+s.name);
		System.out.println("��Ǯ��"+s.price);
		System.out.println("�ͺţ�"+s.model);
		System.out.println("���"+s.sort);
		
		

	}

}
