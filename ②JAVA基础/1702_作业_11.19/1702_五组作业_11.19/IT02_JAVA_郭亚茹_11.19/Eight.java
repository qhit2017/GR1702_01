package guo;

public class Eight {
	public static void main(String[] args) {
	//���λ��Ϊ6���ܱ�3��������λ�������ж��١�
     int sum=0;
     for(int a=100;a<1000;a++){
    	 if(a%10==6 && a%3==0){
    		 sum=sum+1;
    	 }
     }
     System.out.println("��λ��Ϊ6���ܱ�3��������λ������"+sum+"��");
}
}