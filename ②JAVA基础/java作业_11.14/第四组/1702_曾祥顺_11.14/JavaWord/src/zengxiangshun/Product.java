package zengxiangshun;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��13�� ����8:34:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Product {
	//�����������
	int id;//����
	String name;//����
	int price;//�۸�
	String model;//�ͺ�
	String sort;//���
	
	//����������
	public Product(){
		
	}
	//������������
	public Product(int id,String name,int price){
		this.id = id;
		this.name =name;
		this.price = price;
		System.out.println("��ţ�"+id+"\t���ƣ�"+name+"\t�۸�"+price);
		
	} 
	//�����������
	public Product(int id,String name,int price,String model,String sort){
		this.id = id;
		this.name =name;
		this.price = price;
		this.model = model;
		this.sort = sort;
	}
	
	
	

}
