
public class aksfkaf {

	public class Commodity {

		int number;//商品编号
		String name;//名称
		double price;//价格
		char type;//型号
		String sort;//类别
		
		
		Commodity(){
			System.out.println("不带参数的:");
			
		}
		Commodity(int numberA,String nameA,double priceA){
			System.out.println("带三个参数的:");
			number =numberA;
			name   =nameA;
			price  =priceA;
			
		}
		Commodity(int numberS,String nameS,double priceS,char typeS,String sortS){
			System.out.println("带五个参数的:");
			number =numberS;
			name   =nameS;
			price  =priceS;
			type   =typeS;
			sort   =sortS;
			
		}
		
		
		
	}

}

