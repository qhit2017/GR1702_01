package quiert;



/** 
 * @author  ����: xuyunmeng
 * @date    ����ʱ�䣺2017��11��14�� ����6:29:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Snack snack = new Snack();
		   snack.model="cool";
		   snack.name="С�Ե�";
		   snack.price=20;
		   snack.category="���ֶ���";
		   snack.number=500;
		   
		   //�޲����Ĺ��췽��
		   Snack New = new Snack();
		   System.out.println(New);
		   
		   //����š����ơ��۸�����������
		   Snack To = new Snack("cool","С�Ե�",20);

		   System.out.println("���"+To.model);
		   System.out.println("����"+To.name);
		   System.out.println("�۸�"+To.price);
		   
		   
		   //��������Ĺ��췽��
		   Snack Too = new Snack("cool","С�Ե�",20,"���ֶ���",500);
		   System.out.println("���"+Too.model);
		   System.out.println("����"+Too.name);
		   System.out.println("�۸�"+Too.price);
		   System.out.println("����"+Too.category);
		   System.out.println("����"+Too.number);
		   
		   
	}
}
