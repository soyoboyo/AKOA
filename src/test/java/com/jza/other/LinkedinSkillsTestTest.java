package com.jza.other;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

class LinkedinSkillsTestTest {


	class MovingAverage {

		int windowSize;
		Queue<Integer> numbers = new LinkedList<>();

		/**
		 * Initialize your data structure here.
		 */
		public MovingAverage(int size) {
			this.windowSize = size;
		}

		public double next(int val) {
			if (numbers.size() + 1 > this.windowSize) {
				numbers.remove();
			}
			numbers.add(val);

			double sum = 0;
			for (Integer n : numbers) {
				sum += n;
			}
			System.out.println(numbers + " " + sum + " " + numbers.size());
			return (double) (sum / numbers.size());

		}
	}

	@Test
	void test() {


	}


	void method(String e, boolean i, Integer... number) {

	}

	@Test
	void q1() {
		LinkedinSkillsTest.q1();
	}

	@Test
	void q3() {
		LinkedinSkillsTest.q3();
	}

	@Test
	void q5() {
		LinkedinSkillsTest.q5();
	}

	@Test
	void q6() {
		LinkedinSkillsTest.q6();
	}

	@Test
	void q7() {
		LinkedinSkillsTest.q7();
	}

	@Test
	void q9() {
		LinkedinSkillsTest.q9();
	}

	@Test
	void q10() {
		LinkedinSkillsTest.q10();
	}

	@Test
	void q13() {
		LinkedinSkillsTest.q13();
	}
}
