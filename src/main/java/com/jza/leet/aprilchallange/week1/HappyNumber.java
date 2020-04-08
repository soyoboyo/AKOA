package com.jza.leet.aprilchallange.week1;

public class HappyNumber {
	public static boolean isHappy(int n) {
		int falseCount = 0;
		while (n != 1) {
			int sum = 0;
			int tmp = n;
			while (n > 0) {
				tmp = n % 10;
				sum += tmp * tmp;
				n /= 10;
			}
			n = sum;
			if (falseCount > Integer.MAX_VALUE - 1) {
				return false;
			} else {
				falseCount++;
			}
		}
		return true;
	}
}
