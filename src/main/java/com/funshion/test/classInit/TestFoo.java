package com.funshion.test.classInit;

/**
 * �������������δ��룬�ᷢ�ִ�ӡ�����Ľ���Ȳ���1��Ҳ����2������0������ԭ�����Bar������Foo�е�getValue��������ִ��Bar�Ĺ��캯���ǣ�
 * ��������Ϊ������Bar���캯����ͷ�������Foo�Ĺ��캯���Ĵ���
 * ������Foo�Ĺ��캯���е�����getValue����������Java�Թ��캯����ִ��û�������⴦��
 * ��������getValue�����Ǳ�Bar���ص��Ǹ�getValue����
 * �����ڵ���Bar��getValue����ʱ��Bar�Ĺ��캯����û�б�ִ�У����ʱ��j��ֵ����Ĭ��ֵ0��������ǾͿ����˴�ӡ������0��
 * @author gongpb
 * 
 */
public class TestFoo {
	public static void main(String... args) {
		Bar bar = new Bar();
	}
}
