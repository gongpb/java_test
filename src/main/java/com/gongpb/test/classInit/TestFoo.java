package com.gongpb.test.classInit;

/**
		* 如果运行上面这段代码，会发现打印出来的结果既不是1，也不是2，而是0。根本原因就是Bar重载了Foo中的getValue方法。在执行Bar的构造函数是，
		* 编译器会为我们在Bar构造函数开头插入调用Foo的构造函数的代码
		* ，而在Foo的构造函数中调用了getValue方法。由于Java对构造函数的执行没有做特殊处理
		* ，因此这个getValue方法是被Bar重载的那个getValue方法
		* ，而在调用Bar的getValue方法时，Bar的构造函数还没有被执行，这个时候j的值还是默认值0，因此我们就看到了打印出来的0。
		* @author gongpb
		*
		*/
public class TestFoo {
	public static void main(String... args) {
		Bar bar = new Bar();
	}
}
