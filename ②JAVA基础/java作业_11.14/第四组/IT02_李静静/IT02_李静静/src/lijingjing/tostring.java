package lijingjing;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����8:35:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class tostring {
	public static void main(String[] args) {
		
	//�޲�
      Shopping s1 =new Shopping();
      
      
      //����������
      Shopping s2 =new Shopping(007,"�޹���",10);
      System.out.println("��Ʒ��ţ�"+s2.pid);
      System.out.println("��Ʒ���ƣ�"+s2.pname);
      System.out.println("��Ʒ�۸�"+s2.pvalve);
      
      
     //��������� 
      Shopping s3 =new Shopping(007,"�޹���",10,"��ƿ",10086);
      System.out.println("��Ʒ��ţ�"+s3.pid);
      System.out.println("��Ʒ���ƣ�"+s3.pname);
      System.out.println("��Ʒ�۸�"+s3.pvalve);
      System.out.println("��Ʒ�ͺţ�"+s3.pmodel);
      System.out.println("��Ʒ���"+s3.pclass);
      
      
      
      
}
}