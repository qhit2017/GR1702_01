
public class aksfkaf {

	public class Commodity {

		int number;//��Ʒ���
		String name;//����
		double price;//�۸�
		char type;//�ͺ�
		String sort;//���
		
		
		Commodity(){
			System.out.println("����������:");
			
		}
		Commodity(int numberA,String nameA,double priceA){
			System.out.println("������������:");
			number =numberA;
			name   =nameA;
			price  =priceA;
			
		}
		Commodity(int numberS,String nameS,double priceS,char typeS,String sortS){
			System.out.println("�����������:");
			number =numberS;
			name   =nameS;
			price  =priceS;
			type   =typeS;
			sort   =sortS;
			
		}
		
		
		
	}

}

