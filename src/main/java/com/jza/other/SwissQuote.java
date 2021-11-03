package com.jza.other;

import com.jza.Jakis;

import java.util.ArrayList;
import java.util.List;

public class SwissQuote implements Jakis {

	{
		System.out.println("init");
	}

	public SwissQuote(int val) {
		System.out.println("const");
	}


	public static boolean geti() {
		return false;
	}

	public static String solution1(String S, int K) {
		List<String> weekdays = new ArrayList<>(List.of("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
		int index = weekdays.indexOf(S);
		int extraDays = K % 7;
		int newDayIndex = (index + extraDays) % 7;
		return weekdays.get(newDayIndex);
	}


	public static boolean solution2(int[] A, int K) {
		int n = A.length;
		for (int i = 0; i < n - 1; i++) {
			if (A[i] + 1 < A[i + 1])
				return false;
		}
		if (A[0] != 1 || A[n - 1] != K)
			return false;
		else
			return true;
	}

	public static int solution3(int[] A) {
		int ans = A[0];
		for (int i = 1; i < A.length; i++) {
			if (ans > A[i]) {
				ans = A[i];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		new SwissQuote(3);
//		System.out.println(solution2(new int[]{1, 1, 2, 3, 3}, 3)); // true
//		System.out.println(solution2(new int[]{1, 1, 1}, 4)); // false
//		System.out.println(solution2(new int[]{1, 1, 1, 5, 5}, 5)); // false
//		System.out.println(solution2(new int[]{1, 1, 1, 5, 4}, 5)); // false
//		System.out.println(solution2(new int[]{0, 1, 2}, 2)); // false
	}
}
