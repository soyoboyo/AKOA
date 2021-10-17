package com.jza.algoexpert;

import java.util.HashMap;
import java.util.Map;

public class Algo3 {

	public static void main(String[] args) {
		countContainedPermutations("cbabcacabca", "abc");
	}

	public static int countContainedPermutations(String bigString, String smallString) {
		int count = 0;
		Map<Character, Integer> countSmallString = new HashMap<>();
		for (int i = 0; i < smallString.length(); i++) {
			countSmallString.merge(smallString.charAt(i), -1, Integer::sum);
		}
		for (int i = 0; i < bigString.length() - smallString.length(); i++) {
			if (isPermutation(bigString.substring(i, smallString.length() + i), smallString)) {
				count++;
			}
		}
		return count;
	}

	private static boolean isPermutation(String substring, String smallString) {
		Map<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < substring.length(); i++) {
			count.merge(substring.charAt(i), 1, Integer::sum);
		}

		for (int v : count.values()) {
			if (v != 0) {
				return false;
			}
		}
		System.out.println(substring);
		return true;
	}


}
