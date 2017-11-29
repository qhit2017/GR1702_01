package com.zk.qhit.statictest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月20日 下午7:56:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Worker extends Person{
	@Override
	public String getContent() {
		
		return "工作即是要步步搭建与走向成功";
	}
	
	public static void main(String[] args) {
		Worker t=new Worker();
		t.say();
	
	}

}
