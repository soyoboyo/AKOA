package com.jza.codewars.kyu5;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackjackScorerTest {

	BlackjackScorer blackjackScorer = new BlackjackScorer();

	@Test
	public void test1() {
		assertEquals(5, blackjackScorer.getBlackjackScore(Arrays.asList("2", "3")));
	}

	@Test
	public void test2() {
		assertEquals(22, blackjackScorer.getBlackjackScore(Arrays.asList("7", "7", "8")));
	}

	@Test
	public void test3() {
		assertEquals(19, blackjackScorer.getBlackjackScore(Arrays.asList("4", "7", "8")));
	}

	@Test
	public void test4() {
		assertEquals(30, blackjackScorer.getBlackjackScore(Arrays.asList("K", "J", "Q")));
	}

	@Test
	public void test5() {
		assertEquals(14, blackjackScorer.getBlackjackScore(Arrays.asList("A", "3")));
	}

	@Test
	public void test6() {
		assertEquals(12, blackjackScorer.getBlackjackScore(Arrays.asList("A", "A")));
	}

	@Test
	public void test7() {
		assertEquals(22, blackjackScorer.getBlackjackScore(Arrays.asList("A", "2", "A", "9", "9")));
	}

	@Test
	public void test8() {
		assertEquals(25, blackjackScorer.getBlackjackScore(Arrays.asList("5", "4", "3", "2", "A", "K")));
	}

	@Test
	public void test9() {
		assertEquals(18, blackjackScorer.getBlackjackScore(Arrays.asList("2", "3", "3", "9", "A")));
	}


	@Test
	public void test10() {
		assertEquals(30, blackjackScorer.getBlackjackScore(Arrays.asList("K", "J", "Q")));
	}

	@Test
	public void test11() {
		assertEquals(46, blackjackScorer.getBlackjackScore(Arrays.asList("K", "Q", "K", "7", "9")));
	}

	@Test
	public void test12() {
		assertEquals(13, blackjackScorer.getBlackjackScore(Arrays.asList("A", "4", "4", "4")));
	}

	@Test
	public void test13() {
		assertEquals(15, blackjackScorer.getBlackjackScore(Arrays.asList("A", "5", "9")));
	}

	@Test
	public void test14() {
		assertEquals(13, blackjackScorer.getBlackjackScore(Arrays.asList("A", "2", "3", "7")));
	}

	@Test
	public void test15() {
		assertEquals(15, blackjackScorer.getBlackjackScore(Arrays.asList("A", "2", "3", "4", "5")));
	}

	@Test
	public void test16() {
		assertEquals(36, blackjackScorer.getBlackjackScore(Arrays.asList("K", "8", "9", "9")));
	}

	@Test
	public void test17() {
		assertEquals(14, blackjackScorer.getBlackjackScore(Arrays.asList("A", "3", "10")));
	}

	@Test
	public void test18() {
		assertEquals(21, blackjackScorer.getBlackjackScore(Arrays.asList("A", "K")));
	}
}
