package TestOne;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����8:16:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class FoundrTest {
	public static void main(String[] args) {
		
		
			
			Foundr a = new Foundr();
		
			
			System.out.println("����Ʒ���Ϊ:"+a.number);
			System.out.println("����Ʒ��Ϊ:"+a.name);
			System.out.println("����Ʒ�۸�Ϊ:"+a.price);
			System.out.println("����Ʒ�ͺ�Ϊ:"+a.type);
			System.out.println("����Ʒ���Ϊ:"+a.sort);
			
			System.out.println();
			
			Foundr b = new Foundr(66,"������ϴ��Һ",15.5);
			System.out.println("����Ʒ���Ϊ:"+b.number);  
			System.out.println("����Ʒ��Ϊ:"+b.name);
			System.out.println("����Ʒ�۸�Ϊ:"+b.price);
			System.out.println("����Ʒ�ͺ�Ϊ:"+b.type);
			System.out.println("����Ʒ���Ϊ:"+b.sort);
			
			System.out.println();
			
			Foundr c = new Foundr(66,"������ϴ��Һ",15.5,'A',"������Ʒ");
			System.out.println("����Ʒ���Ϊ:"+c.number);
			System.out.println("����Ʒ��Ϊ:"+c.name);
			System.out.println("����Ʒ�۸�Ϊ:"+c.price);
			System.out.println("����Ʒ�ͺ�Ϊ:"+c.type);
			System.out.println("����Ʒ���Ϊ:"+c.sort);
			
			
		}
	}


