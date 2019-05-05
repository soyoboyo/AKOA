package com.jza.challenges.y2019;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Niobium2019Test {

	Niobium2019 t = new Niobium2019();

	@Test
	public void test1() {
		int[][] A = {
				{0, 0, 0, 0},
				{0, 1, 0, 0},
				{1, 0, 1, 1}};
		Assertions.assertEquals(2, t.flippingMatrix(A));
	}

	@Test
	public void test2() {
		int[][] A = {
				{0, 1, 0, 1},
				{1, 0, 1, 0},
				{0, 1, 0, 1},
				{1, 0, 1, 0}};
		Assertions.assertEquals(4, t.flippingMatrix(A));
	}


}
