package com.funshion.test.classloader;

public class Test {
	static {
		System.out.println("��̬����");
		int x=0;
	}
	
	public Test(){
		System.out.println("���췽��");
	}
	
	public static void testStatic(){
		System.out.println("��̬����");
	}
}
