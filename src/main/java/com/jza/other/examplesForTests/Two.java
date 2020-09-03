package com.jza.other.examplesForTests;

public interface Two {
	default void method() {
		System.out.println("Two");
	}
}
