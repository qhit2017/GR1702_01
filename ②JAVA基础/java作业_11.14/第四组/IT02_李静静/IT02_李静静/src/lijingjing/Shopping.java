package lijingjing;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����8:17:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Shopping {
/*��������Ա����Ʒ�࣬��ͨ�����ù��췽������ʵ���� 
������Ʒ�࣬��������Ʒ��š����ơ��۸��ͺš����
������ԣ����ṩ������ͬ�Ĺ��췽�������������ģ���
��š����ơ��۸����������ģ�����������Ĺ��췽����
�ֱ�����������췽��ʵ�������󣬲��۲��Ա������ֵ
�����*/
	//��Ʒ���
	int pid ;
	//��Ʒ����
	String pname ;
	//��Ʒ�۸�
	int pvalve ;
	//��Ʒ�ͺ�
	String pmodel;
	//��Ʒ���
	int pclass ;
	//��������
	Shopping(){
		System.out.println("����һ���޲ε�");
	}
//����������
		Shopping(int pids,String pnames,int pvalves){
			pid = pids;
			pname=pnames;
			pvalve = pvalves;
			
		}
	
//���������
	   Shopping(int pidx,String pnamex,int pvalvex,
			   String pmodelx,int pclassx){
		   pid = pidx;
		   pname =pnamex;
		   pvalve =pvalvex;
		   pmodel =pmodelx;
		   pclass =pclassx;
	   }
	
}
