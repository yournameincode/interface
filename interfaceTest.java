package interfaceTest;

import java.util.*;

/*
 * 如果一个具体类实现一个接口则必须要实现里面的所有方法，抽象类则不需要
 * 接口中可以设置默认方法default 方法
 * 接口必须是public，实现接口的方法也必须设置成public，不然会出现Cannot reduce the visibility of the inherited method from defineInterface 问题
 *接口不能实例化，一个类可以实现多个接口，
 *接口能可以定义变量（自动为静态常量）和静态方法
 * */


public class interfaceTest {
	public static void main(String args[]) {
		defineInterface st=new students();
		defineInterface wk=new worker();
		st.eat();
		st.sleep();
		wk.eat();
		wk.sleep();
		defineInterface.worker();
		System.out.println("this is static method worker"+defineInterface.a);
	}
}

class students implements defineInterface{
	@Override
	public void eat() {
		System.out.println("this is students default method eat");
	}
}

class worker implements defineInterface{
	@Override
	public void sleep() {
		System.out.println("this is worker default method eat");
	}
}

