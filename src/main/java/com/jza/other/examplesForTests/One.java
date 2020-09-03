package com.jza.other.examplesForTests;

public interface One {
	default void method() {
		System.out.println("One");
	}
}
