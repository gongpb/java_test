package com.funshion.test.classInit;

public class Foo {
	int i;

	Foo() {
		i = 1;
		int x = getValue();
		System.out.println(x);
	}

	protected int getValue() {
		return i;
	}
}
