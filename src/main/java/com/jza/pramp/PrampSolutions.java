package com.jza.pramp;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrampSolutions {


	static double root(double x, int n) {
		double mid = x / 2;
		double left = 0.0;
		double right = x;
		while (left < right) {
			double power = Math.pow(mid, n);
			if (Math.abs(x - power) < 0.001) {
				return mid;
			} else if (power > x) {
				right = mid;
			} else if (power < x) {
				left = mid;
			}
			mid = (left + right) / 2;
		}
		return mid;


	}

	static int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {
		int i = 0, j = 0;
		while (i < slotsA.length && j < slotsB.length) {
			int laterStart = Math.max(slotsA[i][0], slotsB[j][0]);
			int earlierEnd = Math.min(slotsA[i][1], slotsB[j][1]);
			int difference = earlierEnd - laterStart;
			if (dur <= difference) {
				return new int[]{laterStart, laterStart + dur};
			}
			if (slotsA[i][1] < slotsB[j][1]) {
				i++;
			} else {
				j++;
			}
		}
		return new int[]{};
	}


	static int[] arrayOfArrayProducts(int[] arr) {
		int len = arr.length;
		if (len < 1) {
			return arr;
		} else if (len == 1) {
			return new int[]{};
		}
		int[] left = new int[len];
		int[] right = new int[len];

		left[0] = 1;
		for (int i = 1; i < len; i++) {
			left[i] = arr[i - 1] * left[i - 1];
		}

		right[len - 1] = 1;
		for (int i = len - 2; i >= 0; i--) {
			right[i] = arr[i + 1] * right[i + 1];
		}


		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			result[i] = left[i] * right[i];
		}


		return result;
	}


	public static int shortestWordEditPath(String source, String target, String[] words) {
		// http://graphonline.ru/en/?graph=coaEQdTlQkssdJOC
		// https://graphonline.ru/en/?graph=FSiXFyaQviHscttx
		// follow up question: which is faster Dijkstra or BFS
		if (source.length() != target.length()) return -1;
		Queue<Map.Entry<String, Integer>> queue = new LinkedList<>();
		Set<String> visited = new HashSet<>();
		int counter = 0;
		Map.Entry<String, Integer> p = new AbstractMap.SimpleEntry<>(source, 0);
		queue.add(p);

		while (!queue.isEmpty()) {
			Map.Entry<String, Integer> current = queue.poll();
			String currentWord = current.getKey();
			System.out.println(current);
			if (target.equals(currentWord)) {
				return current.getValue();
			}

			for (int i = 0; i < words.length; i++) {
				String w = words[i];
				if (visited.contains(w)) continue;
				if (areMatch(w, currentWord)) {
					queue.add(new AbstractMap.SimpleEntry(w, ++counter));
					visited.add(w);
					break;
				}
			}
		}
		return -1;
	}

	public static boolean areMatch(String s1, String s2) {
		int diff = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				diff++;
			}
			if (diff > 1) return false;

		}
		return true;
	}

	public static int fromPramp_shortestWordEditPath(String source, String target, String[] words) {

		if (source.length() != target.length()) return -1;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		Queue<Map.Entry<String, Integer>> queue = new LinkedList<>();
		Set<String> seen = new HashSet<>();
		Set<String> wordSet = Stream.of(words).collect(Collectors.toSet());
		Map.Entry<String, Integer> p = new AbstractMap.SimpleEntry<>(source, 0);
		queue.add(p);
		seen.add(source);
		while (!queue.isEmpty()) {
			Map.Entry<String, Integer> current = queue.poll();
			System.out.println(current);
			String word = current.getKey();
			Integer depth = current.getValue();
			if (target.equals(word)) {
				return depth;
			}


			for (int i = 0; i < word.length(); i++) {
				// first strategy
				for (String word2 : words) {
					if (word2.length() == word.length()) {
						int diff = 0;
						for (int j = 0; j < word.length(); j++) {
							if (word.charAt(j) != word2.charAt(j)) {
								diff += 1;
								if (diff == 2) break;
							}
						}

						if (diff == 1 && !seen.contains(word2)) {
							queue.add(new AbstractMap.SimpleEntry(word2, depth + 1));
							seen.add(word2);
						}
					}
				}
				// first strategy

				// second strategy
//				for (char c : alphabet.toCharArray()) {
//					StringBuilder word2Build = new StringBuilder(word);
//					word2Build.setCharAt(i, c);
//					String word2 = word2Build.toString();
//					if (wordSet.contains(word2) && !seen.contains(word2)) {
//						queue.add(new AbstractMap.SimpleEntry(word2, depth + 1));
//						seen.add(word2);
//					}
//				}
				// second strategy
			}
		}
		return -1;
	}

}
