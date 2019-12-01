package com.jza.codewars;

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

	private String convertAnswerFormat(Stack<Long> values) {
		StringBuilder sb = new StringBuilder();
		while (!values.isEmpty()) {
			sb.append(values.pop());
			sb.append(" ");
		}
		return sb.toString().trim();
	}
}
