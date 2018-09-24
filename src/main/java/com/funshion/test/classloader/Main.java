package com.funshion.test.classloader;
/**
 * Class.forName("xx.xx")等同于Class.forName("xx.xx",true,CALLClass.class.getClassLoader())
 * 第二个参数(bool)表示装载类的时候是否初始化该类，即调用类的静态块的语句及初始化静态成员变量
 * 
 * Class cls = loader.loadClass("xx.xx"); //这句话没有执行初始化，
 * 其实与Class.forName("xx.xx"，false，loader)是一致的，只是loader.loadClass("xx.xx")执行的是更底层的操作。只有执行cls.NewInstance()才能够初始化类，得到该类的一个实例
 */
public class Main {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		  //可以用别的classloader来load其他类
		   ClassLoader loader=Main.class.getClassLoader();
		   System.out.println(loader);
		   System.out.println(loader.getParent());
		   System.out.println(loader.getParent().getParent());
		   
		   System.out.println();
		   System.out.println("------Class.forName()和classloader.loadClass()的比较------");
		   System.out.println();
		   
		   System.out.println("before load");
		   Class c=loader.loadClass("com.funshion.test.classloader.Test"); 
		   System.out.println("after load");
//		   
//		   System.out.println();
//		   System.out.println("before load newInstance");
//		   Test t=(Test) c.newInstance();
//		   System.out.println("after load newInstance");
//		   System.out.println();
		   
		   //Class.forName(String className)方法默认是加载静态代码块的
		   //Class.forName(String className,boolean initialize,ClassLoader loader)则可以控制是否调用静态代码块
		   //Class.forName只是让类加载，并没有把类初始化，只有当调用newInstance时才初始化类，调用构造方法等
		   //ClassLoader进行类加载时，不会调用静态代码块，相当于Class.forName的第二个方法,
		   //只有在newInstance时才调用静态代码块——》初始化变量——》调用构造方法——》生成类实例
//		   System.out.println("before forName");
//		   Class c2=Class.forName("com.funshion.test.classloader.Test");
//		   System.out.println("after forName");
//		   c2.newInstance();
//		   System.out.println();
//		   
//		   System.out.println("before forName false");
//		   Class c3=Class.forName("com.funshion.test.classloader.Test",false, loader);
//		   System.out.println("after forName false");
//		   c3.newInstance();
		   
		   //静态代码块不是在初始化阶段完成的，它先于类初始化，先于普通变量默认分配（整型分配为0，字符串分配为null)
		   
	}
}
