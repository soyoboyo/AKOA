package com.jza.other.examplesForTests;


// Which class can compile given these declarations?
// A
//public class Three implements One, Two {
//	public void method() {
//		super.One.method();
//	}
//}

// B
//public class Three implements One, Two {
//}

// C
public class Three implements One, Two {
	public void method() {
		One.super.method();
	}
}

// D
//public class Three implements One, Two {
//	public void method() {
//		One.method();
//	}
//}
