package com.jza;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BowlingGameTest {

	BowlingGame theGame = new BowlingGame();

	@Test
	public void shouldReturnMaxScoreFor12Strikes() {
		assertEquals(300, theGame.getScore(Arrays.asList("X", "X", "X", "X", "X", "X", "X", "X", "X", "XXX")));
	}

	@Test
	public void shouldReturn90PointsForOnly9s() {
		assertEquals(90, theGame.getScore(Arrays.asList("9-", "9-", "9-", "9-", "9-", "9-", "9-", "9-", "9-", "9-")));
	}

	@Test
	public void shouldReturn150PointsForOnly5s() {
		assertEquals(150, theGame.getScore(Arrays.asList("5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/5")));
	}

	@Test
	public void shouldReturn202() {
		assertEquals(202, theGame.getScore(Arrays.asList("X", "8/", "9/", "8-", "X", "X", "9/", "9/", "X", "X9/")));
	}

	@Test
	public void shouldReturn164() {
		assertEquals(164, theGame.getScore(Arrays.asList("7/", "X", "X", "81", "9/", "81", "X", "8/", "8/", "61")));
	}

	@Test
	public void shouldReturn276() {
		assertEquals(276, theGame.getScore(Arrays.asList("X", "X", "X", "X", "X", "X", "X", "X", "6/", "XXX")));
	}

	@Test
	public void shouldReturn101a() {
		assertEquals(101, theGame.getScore(Arrays.asList("7/", "-7", "7-", "-X", "81", "16", "-8", "7-", "7-", "X8/")));
	}

	@Test
	public void shouldReturn101b() {
		assertEquals(101, theGame.getScore(Arrays.asList("-4", "-X", "8-", "8/", "-/", "3-", "9-", "9/", "9-", "8-")));
	}

	@Test
	public void shouldReturn101c() {
		assertEquals(101, theGame.getScore(Arrays.asList("72", "71", "8/", "71", "18", "53", "34", "35", "8/", "81")));
	}

	@Test
	public void shouldReturn230() {
		assertEquals(230, theGame.getScore(Arrays.asList("X", "X", "X", "X", "X", "X", "X", "81", "7-", "8/7")));
	}

	@Test
	public void shouldReturn138() {
		assertEquals(138, theGame.getScore(Arrays.asList("-9", "X", "81", "X", "X", "9-", "X", "72", "8-", "8-")));
	}

	@Test
	public void shouldReturn25() {
		assertEquals(25, theGame.getScore(Arrays.asList("--", "5/", "--", "-/", "--", "--", "--", "--", "--", "-5")));
	}

	@Test
	public void shouldReturn94() {
		assertEquals(94, theGame.getScore(Arrays.asList("7-", "9-", "9-", "81", "63", "16", "7-", "8/", "9-", "9-")));
	}

}


