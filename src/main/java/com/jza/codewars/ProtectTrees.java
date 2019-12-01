package com.jza.codewars;

import java.util.LinkedList;
import java.util.List;

public class ProtectTrees {

	public String decompose(long n) {
		List<Long> squares = new LinkedList<>();
		Long number = n - 1;
		Long leftOver = n * n;
		while (leftOver > 0) {
			Long square = number * number;
			squares.add(number);
			leftOver -= square;
			number = (long) Math.sqrt(leftOver);
		}
		System.out.println(squares);
		return "";
	}


}
