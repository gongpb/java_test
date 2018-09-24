package com.funshion.test.classloader;
/**
 * Class.forName("xx.xx")��ͬ��Class.forName("xx.xx",true,CALLClass.class.getClassLoader())
 * �ڶ�������(bool)��ʾװ�����ʱ���Ƿ��ʼ�����࣬��������ľ�̬�����估��ʼ����̬��Ա����
 * 
 * Class cls = loader.loadClass("xx.xx"); //��仰û��ִ�г�ʼ����
 * ��ʵ��Class.forName("xx.xx"��false��loader)��һ�µģ�ֻ��loader.loadClass("xx.xx")ִ�е��Ǹ��ײ�Ĳ�����ֻ��ִ��cls.NewInstance()���ܹ���ʼ���࣬�õ������һ��ʵ��
 */
public class Main {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		  //�����ñ��classloader��load������
		   ClassLoader loader=Main.class.getClassLoader();
		   System.out.println(loader);
		   System.out.println(loader.getParent());
		   System.out.println(loader.getParent().getParent());
		   
		   System.out.println();
		   System.out.println("------Class.forName()��classloader.loadClass()�ıȽ�------");
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
		   
		   //Class.forName(String className)����Ĭ���Ǽ��ؾ�̬������
		   //Class.forName(String className,boolean initialize,ClassLoader loader)����Կ����Ƿ���þ�̬�����
		   //Class.forNameֻ��������أ���û�а����ʼ����ֻ�е�����newInstanceʱ�ų�ʼ���࣬���ù��췽����
		   //ClassLoader���������ʱ��������þ�̬����飬�൱��Class.forName�ĵڶ�������,
		   //ֻ����newInstanceʱ�ŵ��þ�̬����顪������ʼ���������������ù��췽��������������ʵ��
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
		   
		   //��̬����鲻���ڳ�ʼ���׶���ɵģ����������ʼ����������ͨ����Ĭ�Ϸ��䣨���ͷ���Ϊ0���ַ�������Ϊnull)
		   
	}
}
