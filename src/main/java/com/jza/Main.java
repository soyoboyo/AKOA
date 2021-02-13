package com.jza;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<String> text = Arrays.asList("code", "aaagmnrs", "anagrams", "doce");
		funWithAnagrams(text);
	}

	public static List<Integer> subsetA(List<Integer> input) {
		List<Integer> arr = new ArrayList<>(input);
		long sumTotal = 0;
		for (Integer i : arr) {
			sumTotal += i;
		}
		List<Integer> result = new ArrayList<>();
		Collections.sort(arr, Collections.reverseOrder());
		long sumA = 0;
		for (Integer x : arr) {
			sumA += x;
			result.add(x);
			long sumB = sumTotal - sumA;
			if (sumA > sumB) {
				break;
			}
		}
		Collections.reverse(result);
		return result;
	}


	public static List<String> funWithAnagrams(List<String> text) {
		List<String> result = new ArrayList<>();
		Set<String> collectedWords = new HashSet<>();
		for (String s : text) {
			String sorted = Stream.of(s.split(""))
					.sorted()
					.collect(Collectors.joining());
			if (!collectedWords.contains(sorted)) {
				result.add(s);
				collectedWords.add(sorted);
			}
		}
		Collections.sort(result);
		return result;
	}

//	public static void commonSubstring(List<String> a, List<String> b) {
//		for (int i = 0; i < a.size(); i++) {
//			Set<Character> setA = a.get(i).chars()
//					.mapToObj(e -> (char) e).collect(Collectors.toSet());
//			boolean hasCommmonChar = false;
//			for (Character bChar : b.get(i).toCharArray()) {
//				if (setA.contains(bChar)) {
//					hasCommmonChar = true;
//					break;
//				}
//			}
//			if (hasCommmonChar) {
//				System.out.println("YES");
//			} else {
//				System.out.println("YES");
//			}
//
//		}
//
//	}
}
