package guguoxin;
/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��14�� ����9:05:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Value {

	public static void main(String[] args) {
		int a = 0;
		for(int b = 1;b<=100;b++){
			if(!(b%10==3)){
				a+=b;
				
			}
		}System.out.println("1��100���ۼ�ֵΪ:"+a);
	}

}
