package com.jza.codewars.kyu8;

public class ExpressionsMatter {
	public static int expressionsMatter(int a, int b, int c) {
		int ab = addOrMult(a, b);
		int bc = addOrMult(b, c);
		if (ab > bc) {
			return addOrMult(ab, c);
		}
		return addOrMult(a, bc);
	}

	public static int addOrMult(int x, int y) {
		if (x == 1 || y == 1) {
			return x + y;
		} else {
			return x * y;
		}
	}
}
