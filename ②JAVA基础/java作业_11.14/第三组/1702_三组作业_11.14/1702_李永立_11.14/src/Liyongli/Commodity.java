package Liyongli;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��13�� ����8:18:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Commodity {
	//����
	//������Ʒ��ţ����ƣ��۸��ͺţ���� �������
	 private  String  id;
	String name;
	double  value;
	String model;
	String genre ;
	 Commodity(String ids, String names, double values,String models, String genres ){
		 id =ids;
		 name =names;
		 value =values;
		 model =models;
		 genre =genres;
		System.out.println("����һ���޲ι��췽��������Ϊ�㹹�����");
		
	}
	//����
		void setId(String ids){
			if (ids.equals("000")){
				System.out.println("�����Դ�id ��Ϊ��Ʒid");
			}else{
				id =ids;
			}
		}
		//��ȡ
		String getId(){
			return id;
		}
	
	
	
	
	

}
