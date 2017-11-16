
public class kasflafkal {
	//一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程找出1000以内的所有完数。
	public static void main(String[] args) {
		int count=1;
		for(int a=1;a<1000;a++){
		                int b=0;
		                for(int c=1;c<a;c++)
		                if(a%c==0) 
		                 b +=c;
		                if(b==a){
		               System.out.print(a+"\t");                                

		                count++; 
		                if(count%4==0)                                                          

		               System.out.println(); 
	                          }
		            }
	           }
	      }


