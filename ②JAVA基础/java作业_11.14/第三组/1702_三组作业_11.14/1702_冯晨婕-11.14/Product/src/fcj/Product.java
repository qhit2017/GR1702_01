/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author ���ߣ�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺14 Nov 2017 5:56:56 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Product {
//���췽��
	String id;
	String  name;
	double price;
	String model;
	String category;
	//�޲�
	Product(){
	System.out.println("�����޲�");}
	
	//����
	Product(String ids,String  names,double prices){
	id=ids;
	name=names;
	price=prices;}
	
	//���
	Product(String ids,String  names,double prices,String models,String categorys){
		id=ids;
		name=names;
		price=prices;
		model=models;
		category=categorys;
		
}
}