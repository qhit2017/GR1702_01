package TestOne;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����8:10:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Foundr {
	
	int number;//��Ʒ���
	String name;//����
	double price;//�۸�
	char type;//�ͺ�
	String sort;//���
	
	
	Foundr(){
		System.out.println("����������:");
		
	}
	Foundr(int numberA,String nameA,double priceA){
		System.out.println("������������:");
		number =numberA;
		name   =nameA;
		price  =priceA;
		
	}
	Foundr(int numberS,String nameS,double priceS,char typeS,String sortS){
		System.out.println("�����������:");
		number =numberS;
		name   =nameS;
		price  =priceS;
		type   =typeS;
		sort   =sortS;
		
	}
	

}
