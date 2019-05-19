package com.jza.recruitment;

import com.jza.recruitment.amazon.Amazon;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AmazonTest {

	@Test
	public void reverseArrayTest1() {
		int[] input = {1, 2, 3, 4, 5, 6, 7};
		int[] result = {7, 6, 5, 4, 3, 2, 1};
		Assertions.assertArrayEquals(result, Amazon.reverseArray(input));
	}

	@Test
	public void reverseArrayTest2() {
		int[] input = {6, 2, 4, 8};
		int[] result = {8, 4, 2, 6};
		Assertions.assertArrayEquals(result, Amazon.reverseArray(input));
	}

	@Test
	public void sortArrayTest1() {
		int[] input = {23, 12, 14, 24, 21};
		int[] result = {24, 23, 21, 14, 12};
		Assertions.assertArrayEquals(result, Amazon.sortArray(input));
	}

	@Test
	public void sortArrayTest2() {
		int[] input = {1, 1, 1, 1, 1};
		int[] result = {1, 1, 1, 1, 1};
		Assertions.assertArrayEquals(result, Amazon.sortArray(input));
	}

	@Test
	public void replaceValuesTest1() {
		int[] input = {2, 5, 3, 7, 9, 4};
		int[] result = {0, 0, 0, 0, 0, 0};
		Assertions.assertArrayEquals(result, Amazon.replaceValues(input));
	}

	@Test
	public void replaceValuesTest2() {
		int[] input = {21, 22, 3, 24, 65};
		int[] result = {1, 1, 1, 1, 1,};
		Assertions.assertArrayEquals(result, Amazon.replaceValues(input));
	}


	@Test
	public void countOccurrenceTest1() {
		int[] inputArr = {2, 3, 4, 3, 5, 6, 7};
		int input = 3;
		int result = 2;
		Assertions.assertEquals(result, Amazon.countOccurrence(inputArr, input));
	}

	@Test
	public void countOccurrenceTest2() {
		int[] inputArr = {9};
		int input = 2;
		int result = 0;
		Assertions.assertEquals(result, Amazon.countOccurrence(inputArr, input));
	}


	@Test
	public void checkGradeTest1() {
		int input = 54;
		char result = 'D';
		Assertions.assertEquals(result, Amazon.checkGrade(input));
	}

	@Test
	public void checkGradeTest2() {
		int input = 78;
		char result = 'B';
		Assertions.assertEquals(result, Amazon.checkGrade(input));
	}


	@Test
	public void countDigitsTest1() {
		int input = 782;
		int result = 2;
		Assertions.assertEquals(result, Amazon.countDigits(input));
	}

	@Test
	public void countDigitsTest2() {
		int input = 21340;
		int result = 0;
		Assertions.assertEquals(result, Amazon.countDigits(input));
	}


	@Test
	public void printPatternTest1() {
		int input = 4;

		System.out.println("11");
		System.out.println("1111");
		System.out.println("111111");
		System.out.println("11111111");
		Assertions.assertEquals("", Amazon.printPattern(input));

	}


	@Test
	public void printPatternTest2() {
		int input = 1;
		System.out.println("11");
		Assertions.assertEquals("", Amazon.printPattern(input));
	}
}
