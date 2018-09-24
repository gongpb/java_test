package com.gongpb.test.classInit;

public class Bar extends Foo{
	int j;

//	Bar() {
//		j = 2;
//	}

	@Override
	protected int getValue() {
		return j;
	}
}
