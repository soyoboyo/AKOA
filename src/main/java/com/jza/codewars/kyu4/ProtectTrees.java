package com.jza.codewars.kyu4;

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
		while (leftOver > 0) {
			long square = number * number;
			leftOver -= square;
			solution.add(number);
			number = (long) Math.sqrt(leftOver);
			if (number == previousN) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
		return solution;
	}

	private static boolean verifySolution(List<Long> solution) {
		for (int i = 0; i < solution.size() - 1; i++) {
			if (solution.get(i).equals(solution.get(i + 1))) {
				return false;
			}
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
