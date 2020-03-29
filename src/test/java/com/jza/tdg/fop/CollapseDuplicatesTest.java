package com.jza.tdg.fop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollapseDuplicatesTest {

	@Test
	public void test1() {
		assertEquals("a", CollapseDuplicates.collapseDuplicates("a"));
	}

	@Test
	public void test2() {
		assertEquals("a", CollapseDuplicates.collapseDuplicates("aa"));
	}

	@Test
	public void test3() {
		assertEquals("abc", CollapseDuplicates.collapseDuplicates("abc"));
	}

	@Test
	public void test4() {
		assertEquals("a", CollapseDuplicates.collapseDuplicates("aaa"));
	}

}
