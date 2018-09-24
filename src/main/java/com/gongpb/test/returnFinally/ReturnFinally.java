package com.gongpb.test.returnFinally;

public class ReturnFinally {
    public static void main(String[] args) {

        System.out.println(decision()); //打印false

    }
    /**
     * 当try语句块和finally语句块都意外结束时，
     * 在try语句块中引发意外结束的原因将被丢弃，而整个try-finally语句意外结束的原因将于finally语句块意外结束的原因相同
     * @return
     */
    static boolean decision() {
        try {
            return true;
        } finally {
            //不要用一个return、break、continue或throw来退出一个finally语句块
            return false;
        }
    }
}