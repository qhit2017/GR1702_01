package merchandise;

public class Test {
	public static void main(String[] args) {
		//���������Ĺ��췽��
		Merchandise  merchandise = new Merchandise();
		System.out.println(merchandise);
		
		
		
		//����š����ơ��۸����������Ĺ��췽��
	Merchandise TUTU = new Merchandise(	34,"�·�",64);
	
     System.out.println( "�����:"+TUTU.id);
     System.out.println("������:"+TUTU.name);
     System.out.println("�۸���:"+TUTU.price);
     System.out.println("Ʒ����:"+TUTU.brand);
 	 System.out.println("������:"+TUTU.category);
     
     
     
     //����������Ĺ��췽��
 	Merchandise MAO = new Merchandise(	34,"�·�",64,"�ز�","17");
 	System.out.println( "�����:"+MAO.id);
    System.out.println("������:"+MAO.name);
    System.out.println("�۸���:"+MAO.price);
	System.out.println("Ʒ����:"+MAO.brand);
	System.out.println("������:"+MAO.category);
	}                                                        

}