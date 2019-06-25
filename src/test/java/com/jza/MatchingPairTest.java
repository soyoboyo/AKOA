package com.jza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatchingPairTest {

	MatchingPair t = new MatchingPair();

	@Test
	public void test() {
		assertAll(
				() -> assertTrue(t.containsMatchingPair(new int[]{1, 2, 3, 4, 5}, 8)),
				() -> assertTrue(t.containsMatchingPair(new int[]{1, 2, 4, 5}, 8)),
				() -> assertTrue(t.containsMatchingPair(new int[]{1, 2, 4, 4}, 8))
		);
	}
}
