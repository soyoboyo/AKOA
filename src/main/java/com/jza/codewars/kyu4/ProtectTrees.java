package com.jza.codewars.kyu4;

import java.util.Stack;

public class ProtectTrees {

	public String decompose(long n) {
		Stack<Long> squares = new Stack<>();
		Long number = n - 1;
		Long leftOver = n * n;
		while (leftOver > 0) {
			Long square = number * number;
			squares.push(number);
			leftOver -= square;
			number = (long) Math.sqrt(leftOver);
		}
		System.out.println(squares);
		return convertAnswerFormat(squares);
	}

	private String convertAnswerFormat(Stack<Long> solution) {
		StringBuilder sb = new StringBuilder();
		while (!solution.isEmpty()) {
			sb.append(solution.pop());
			sb.append(" ");
		}
		return sb.toString().trim();
	}
}
