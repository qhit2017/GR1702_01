
/** 
 * @author  ���� E-mail:1603559382@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����7:56:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		System.out.println("������������");
		Commodity men = new Commodity("001","С��1",45.5);
			System.out.println("����:"+men.name);
			System.out.println("���:"+men.number);
			System.out.println("�۸�:"+men.price);
			System.out.println("�ͺ�:"+men.model);
			System.out.println("���:"+men.category);
			System.out.println("�����������");
		Commodity you = new Commodity("002","С��2",56.3,"jd-A","S");
			System.out.println("����:"+you.name1);
			System.out.println("���:"+you.number1);
			System.out.println("�۸�:"+you.price1);
			System.out.println("�ͺ�:"+you.model1);
			System.out.println("���:"+you.category1);
			System.out.println("��������");
			System.out.println(men);
	}
}
