package com.jza.other;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HackAttemptDiscoveryTest {

	@Test
	public void test1() {
		String expected = "{2.21.107.254=72, 130.25.179.252=29, 57.48.9.100=28}";
		assertEquals(expected, HackAttemptDiscovery.solve1());
	}

	@Test
	public void test2() {
		List<String> expected = new ArrayList<>();
		String filler = " successful logins from that ";
		expected.add(0 + filler + "57.48.9.100");
		expected.add(0 + filler + "2.21.107.254");
		expected.add(12 + filler + "130.25.179.252");
		List<String> result = HackAttemptDiscovery.solve2();
		assertEquals(expected.get(0), result.get(0));
		assertEquals(expected.get(1), result.get(1));
		assertEquals(expected.get(2), result.get(2));
	}

	@Test
	public void test3() {
		assertEquals(16, HackAttemptDiscovery.solve3());
	}
}
