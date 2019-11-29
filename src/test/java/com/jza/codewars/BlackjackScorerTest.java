package com.jza.codewars;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BlackjackScorerTest {

	BlackjackScorer blackjackScorer = new BlackjackScorer();

	@Test
	public void test1() {
		Assertions.assertEquals(5, blackjackScorer.getBlackjackScore(Arrays.asList("2", "3")));
	}

	@Test
	public void test2() {
		Assertions.assertEquals(22, blackjackScorer.getBlackjackScore(Arrays.asList("7", "7", "8")));
	}

	@Test
	public void test3() {
		Assertions.assertEquals(19, blackjackScorer.getBlackjackScore(Arrays.asList("4", "7", "8")));
	}

	@Test
	public void test4() {
		Assertions.assertEquals(30, blackjackScorer.getBlackjackScore(Arrays.asList("K", "J", "Q")));
	}

	@Test
	public void test5() {
		Assertions.assertEquals(14, blackjackScorer.getBlackjackScore(Arrays.asList("A", "3")));
	}

	@Test
	public void test6() {
		Assertions.assertEquals(12, blackjackScorer.getBlackjackScore(Arrays.asList("A", "A")));
	}

	@Test
	public void test7() {
		Assertions.assertEquals(22, blackjackScorer.getBlackjackScore(Arrays.asList("A", "2", "A", "9", "9")));
	}

	@Test
	public void test8() {
		Assertions.assertEquals(25, blackjackScorer.getBlackjackScore(Arrays.asList("5", "4", "3", "2", "A", "K")));
	}

	@Test
	public void test9() {
		Assertions.assertEquals(18, blackjackScorer.getBlackjackScore(Arrays.asList("2", "3", "3", "9", "A")));
	}


	@Test
	public void test10() {
		Assertions.assertEquals(30, blackjackScorer.getBlackjackScore(Arrays.asList("K", "J", "Q")));
	}

	@Test
	public void test11() {
		Assertions.assertEquals(46, blackjackScorer.getBlackjackScore(Arrays.asList("K", "Q", "K", "7", "9")));
	}

	@Test
	public void test12() {
		Assertions.assertEquals(13, blackjackScorer.getBlackjackScore(Arrays.asList("A", "4", "4", "4")));
	}

	@Test
	public void test13() {
		Assertions.assertEquals(15, blackjackScorer.getBlackjackScore(Arrays.asList("A", "5", "9")));
	}

	@Test
	public void test14() {
		Assertions.assertEquals(13, blackjackScorer.getBlackjackScore(Arrays.asList("A", "2", "3", "7")));
	}

	@Test
	public void test15() {
		Assertions.assertEquals(15, blackjackScorer.getBlackjackScore(Arrays.asList("A", "2", "3", "4", "5")));
	}

	@Test
	public void test16() {
		Assertions.assertEquals(36, blackjackScorer.getBlackjackScore(Arrays.asList("K", "8", "9", "9")));
	}

	@Test
	public void test17() {
		Assertions.assertEquals(14, blackjackScorer.getBlackjackScore(Arrays.asList("A", "3", "10")));
	}

	@Test
	public void test18() {
		Assertions.assertEquals(21, blackjackScorer.getBlackjackScore(Arrays.asList("A", "K")));
	}
}
