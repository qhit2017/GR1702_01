package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月14日 上午8:35:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class tostring {
	public static void main(String[] args) {
		
	//无参
      Shopping s1 =new Shopping();
      
      
      //有三个参数
      Shopping s2 =new Shopping(007,"娃哈哈",10);
      System.out.println("商品编号："+s2.pid);
      System.out.println("商品名称："+s2.pname);
      System.out.println("商品价格："+s2.pvalve);
      
      
     //有五个参数 
      Shopping s3 =new Shopping(007,"娃哈哈",10,"大瓶",10086);
      System.out.println("商品编号："+s3.pid);
      System.out.println("商品名称："+s3.pname);
      System.out.println("商品价格："+s3.pvalve);
      System.out.println("商品型号："+s3.pmodel);
      System.out.println("商品类别"+s3.pclass);
      
      
      
      
}
}