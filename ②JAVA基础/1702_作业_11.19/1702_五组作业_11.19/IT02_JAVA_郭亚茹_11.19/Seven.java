package guo;

public class Seven {
	public static void main(String[] args){
	//��1,2,3,4,5,���������ȡ�������г����ǵ�������ϲ����������Ļ�ϡ�
      for(int a=1;a<=5;a++){
    	  for(int b=1;b<=5;b++){
    		  if(a==b){
    			  continue;
    		  
    		  }
    		  System.out.print(a);
    		  System.out.println(b);
    	  }
      }
}
}