package merchandise;

public class Merchandise {
     String name ;
     int     id   ;
     double price;
     String brand;
     String category;
     //���������Ĺ��췽��
     Merchandise(){
    	 
     }
     //���������ģ�����š����ơ��۸����������Ĺ��췽��
     
     Merchandise(int ids,String names,double prices){
    	 
    	 id   = ids ;
    	 name = names;
    	 price=  prices;
    	 
    	 System.out.println("���ǹ��췽���������ڹ���һ������");
     }
     
     
     //����������Ĺ��췽��
     Merchandise(int ids,String names,double prices, String brands, String categorys){
    	id      =      ids;
    	name    =    names;
    	price   =   prices;
    	brand   =   brands;
    	category=categorys;
    	
    	
     }
     }

