package com.gongpb.test.classloader;

public class Test {
	static {
		System.out.println("静态代码");
		int x=0;
	}

	public Test(){
		System.out.println("构造方法");
	}

	public static void testStatic(){
		System.out.println("静态方法");
	}
}
