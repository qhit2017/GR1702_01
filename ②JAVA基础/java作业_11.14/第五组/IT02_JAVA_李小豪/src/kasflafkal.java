
public class kasflafkal {
	//һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "������6=1��2��3.����ҳ�1000���ڵ�����������
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


