
public class perfectinteger {
	//һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ����
	public static void main(String[] args) {
		for(int a=1;a<=1000;a++){
			int sum=0;
			for(int b=1;b<a;b++){
				
				if(a%b==0){
					
					sum +=b;
				}
			}if(sum==a){
				System.out.println(a+"\t");
			}
		}
	
	}

}