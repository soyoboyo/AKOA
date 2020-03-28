package com.jza.tdg.fop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EncoderProblemTest {

	@Test
	public void test1() {
		assertArrayEquals(new String[]{"1"},
				EncoderProblem.encoder(new String[]{"a"}, new String[]{"1", "2", "3", "4"}));
	}

	@Test
	public void test2() {
		assertArrayEquals(new String[]{"1", "2"},
				EncoderProblem.encoder(new String[]{"a", "b"}, new String[]{"1", "2", "3", "4"}));
	}

	@Test
	public void test3() {
		assertArrayEquals(new String[]{"1", "2", "1"},
				EncoderProblem.encoder(new String[]{"a", "b", "a"}, new String[]{"1", "2", "3", "4"}));
	}

}
