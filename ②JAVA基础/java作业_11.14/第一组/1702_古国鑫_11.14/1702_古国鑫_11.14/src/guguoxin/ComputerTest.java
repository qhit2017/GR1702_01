package guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��14�� ����9:00:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ComputerTest {

	public static void main(String[] args) {
		
		Computer a = new Computer("����",6000,"�ʼǱ�����");
		
		System.out.println("����Ʒ��Ʒ���ǣ�"+a.name);
		System.out.println("����Ʒ�ļ۸��ǣ�"+a.price);
		System.out.println("����Ʒ�������ǣ�"+a.category);
	}
}
