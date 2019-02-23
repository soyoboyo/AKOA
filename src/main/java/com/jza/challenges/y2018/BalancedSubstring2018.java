package com.jza.challenges.y2018;

import java.lang.reflect.Array;
import java.util.*;

public class BalancedSubstring2018 {

	public static int balancedString(String S) {
		Integer N = S.length(), count = 0, front = 1;
		Integer UB = upperBound(S);
		System.out.println("UB= " + UB);
		for (int back = 0; back < N - 1; back++) {
			front = back + 1;
			while (front < N && (front + 1) - back <= UB*2) {
				if (checkIfBalanced(S.substring(back, front + 1))) {
					count = Math.max(count, (front + 1) - back);
				}
				front++;
			}
		}

		return count;
	}

	public static Boolean checkIfBalanced(String S) {
		HashSet<Character> set = new HashSet<>();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < S.length(); i++) {
			Character c = S.charAt(i);
			set.add(c);
			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		if (set.size() == 2 && map.values().toArray()[0] == map.values().toArray()[1]) {
			return true;
		}
		return false;
	}

	public static Integer upperBound(String S) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < S.length(); i++) {
			Character c = S.charAt(i);
			System.out.println(c);
			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map.values());
		Integer[] values = new Integer[map.size()];
		int index = 0;
		for (Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
			values[index] = mapEntry.getValue();
			index++;
		}
		Arrays.sort(values, Collections.<Integer>reverseOrder());
		if (values.length >= 2 && map.size() >= 2) {
			return values[1];
		} else return S.length();
	}
}


//		for (int back = 0; back < N-1; back++) {
//			HashSet<Character> set = new HashSet<>();
//			set.add(S.charAt(back));
//			front = back + 1;
//			while (front < N && set.size() <= 2) {
//				set.add(S.charAt(front));
//				if (set.size() == 2) {
//					System.out.println("b " + back);
//					System.out.println("f "+ front);
//					count = Math.max(count, front - back);
//				}
//				front++;
//			}
//		}