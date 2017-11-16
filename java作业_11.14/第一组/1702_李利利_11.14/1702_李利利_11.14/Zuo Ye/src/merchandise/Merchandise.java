package merchandise;

public class Merchandise {
     String name ;
     int     id   ;
     double price;
     String brand;
     String category;
     //不带参数的构造方法
     Merchandise(){
    	 
     }
     //不带参数的，带编号、名称、价格三个参数的构造方法
     
     Merchandise(int ids,String names,double prices){
    	 
    	 id   = ids ;
    	 name = names;
    	 price=  prices;
    	 
    	 System.out.println("我是构造方法，我正在构造一个对象");
     }
     
     
     //带五个参数的构造方法
     Merchandise(int ids,String names,double prices, String brands, String categorys){
    	id      =      ids;
    	name    =    names;
    	price   =   prices;
    	brand   =   brands;
    	category=categorys;
    	
    	
     }
     }

