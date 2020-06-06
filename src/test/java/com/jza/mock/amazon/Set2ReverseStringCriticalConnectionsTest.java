package com.jza.mock.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Set2ReverseStringCriticalConnectionsTest {

	@Test
	public void test11() {
		assertEquals("", Set2ReverseStringCriticalConnections.reverseStr("abcdefg", 2));
	}

	@Test
	public void test12() {
		assertEquals("jlnnxsetgcpsbhsfymrkhfursyissjnsocgdhgfxtxrlvugsaphqzxllwebukgatzfybprfmmfithphccxfsogsgqsnvckjvnskk"
				, Set2ReverseStringCriticalConnections.reverseStr("krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc", 20));
	}

	@Test
	public void test13() {
		assertEquals("bacd", Set2ReverseStringCriticalConnections.reverseStr("abcd", 2));
	}

	@Test
	public void test14() {
		assertEquals("abcdefg", Set2ReverseStringCriticalConnections.reverseStr("abcdefg", 1));
	}


}
