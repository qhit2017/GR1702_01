package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月13日 下午8:17:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Shopping {
/*创建管理员与商品类，并通过调用构造方法进行实例化 
创建商品类，并给出商品编号、名称、价格、型号、类别
五个属性，并提供三个不同的构造方法：不带参数的，带
编号、名称、价格三个参数的，带五个参数的构造方法；
分别调用三个构造方法实例化对象，并观察成员变量赋值
情况；*/
	//商品编号
	int pid ;
	//商品名称
	String pname ;
	//商品价格
	int pvalve ;
	//商品型号
	String pmodel;
	//商品类别
	int pclass ;
	//不带参数
	Shopping(){
		System.out.println("我是一个无参的");
	}
//带三个参数
		Shopping(int pids,String pnames,int pvalves){
			pid = pids;
			pname=pnames;
			pvalve = pvalves;
			
		}
	
//带五个参数
	   Shopping(int pidx,String pnamex,int pvalvex,
			   String pmodelx,int pclassx){
		   pid = pidx;
		   pname =pnamex;
		   pvalve =pvalvex;
		   pmodel =pmodelx;
		   pclass =pclassx;
	   }
	
}
