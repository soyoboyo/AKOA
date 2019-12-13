package com.jza.codewars.kyu7;

public class SumBetweenNumbers {
	public int GetSum(int a, int b) {
		if (a == b) {
			return a;
		}
		if (b < a) {
			int temp = a;
			a = b;
			b = temp;
		}
		int sum = a;
		for (int i = ++a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
}
