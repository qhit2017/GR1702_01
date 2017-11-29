package qhit;
/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月23日 上午8:38:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class test {
public static void main(String[] args) {
	Student st =new Student();
	System.out.println("就叫："+st.name);
	System.out.println("今年"+st.age);
	System.out.print("");
	st.say();
	
	Workder te =new Workder();
	System.out.println("你是我的"+te.name);
	System.out.println("现在"+te.age);
	System.out.print("我，"+"遇见你");
	te.say();
}
}
