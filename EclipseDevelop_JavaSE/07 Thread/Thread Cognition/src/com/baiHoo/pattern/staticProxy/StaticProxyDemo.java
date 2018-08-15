package com.baiHoo.pattern.staticProxy;

/**
 * 静态代理 设计模式
 * 1、真实角色
 * 2、代理角色： 持有真实角色的引用
 * 3、二者 实现相同的接口
 * 
 * @author Administrator
 *
 */
public class StaticProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建真实角色
		Marry you =new You();
		//创建代理角色 +真实角色的引用
		WeddingCompany company =new WeddingCompany(you);
		//执行任务
		company.marry();
	}

}
//接口
interface Marry{
	public abstract void marry();
}
//真实角色
class You implements Marry{

	@Override
	public void marry() {
		System.out.println("you and  嫦娥结婚了....");
	}
	
}
//代理角色
class WeddingCompany implements Marry{
	private Marry you;
	
	/**
	 * 无参构造
	 */
	public WeddingCompany() {
	}
	/**
	 * 带参构造函数
	 * @param you  要被代理的对象
	 */
	public WeddingCompany(Marry you) {
		this.you = you;
	}
	private void before(){
		System.out.println("布置猪窝....");
		
	}
	private void after(){
		System.out.println("闹玉兔....");
	}
	@Override
	public void marry() {
		before();
		you.marry();
		after();
	}
}
