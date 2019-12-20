package com.jza.codewars.kyu4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ProtectTrees {

	public static String decompose(long n) {
		List<Long> solution = getSolution(n);
		return convertAnswerFormat(solution);
	}

	private static List<Long> getSolution(long n) {
		List<Long> solution = new Stack<>();
		Long number = n - 1;
		long leftOver = n * n;
		long previousN = number;
		do {
			long square = number * number;
			leftOver -= square;

			solution.add(number);
			number = (long) Math.sqrt(leftOver);

		} while (leftOver > 0);
		return solution;
	}

	private static boolean verifySolution(List<Long> solution) {
		long previousNumber = solution.get(0);
		for (int i = 1; i < solution.size(); i++) {
			long currentNumber = solution.get(i);
			if (currentNumber == previousNumber) {
				return false;
			}
			previousNumber = currentNumber;
		}
		return true;
	}

	private static String convertAnswerFormat(List<Long> solution) {
		Collections.reverse(solution);
		StringBuilder sb = new StringBuilder();
		for (Long square : solution) {
			sb.append(square);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
		System.out.println(verifySolution(solution));
		return sb.toString().trim();
	}

}
