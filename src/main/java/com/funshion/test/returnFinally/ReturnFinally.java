package com.funshion.test.returnFinally;

public class ReturnFinally {
	public static void main(String[] args) {
		 
        System.out.println(decision()); //��ӡfalse
 
    }
 /**
  * ��try�����finally���鶼�������ʱ��
  * ��try�������������������ԭ�򽫱�������������try-finally������������ԭ����finally�������������ԭ����ͬ
  * @return
  */
    static boolean decision() {
        try {
            return true;
        } finally {
        	//��Ҫ��һ��return��break��continue��throw���˳�һ��finally����
            return false;
        }
    } 
}
