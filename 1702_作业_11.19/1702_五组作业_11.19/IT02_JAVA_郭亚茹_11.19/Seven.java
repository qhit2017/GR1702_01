package guo;

public class Seven {
	public static void main(String[] args){
	//从1,2,3,4,5,这五个数任取两个数列出他们的所有组合并且输出到屏幕上。
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