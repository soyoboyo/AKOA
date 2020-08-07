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

	static int findBusiestPeriod(int[][] data) {
//		int[][] input = new int[][]{
//			{1487799425, 14, 1},
//			{1487799425, 4,  0},
//			{1487799425, 2,  0},
//			{1487800378, 10, 1},
//			{1487801478, 18, 0},
//			{1487801478, 18, 1},
//			{1487901013, 1,  0},
//			{1487901211, 7,  1},
//			{1487901211, 7,  0} };
		int count = 0;
		int maxCount = Integer.MIN_VALUE;
		int maxTime = 0;

		for (int i = 0; i < data.length; i++) {
			int time = data[i][0];
			int people = data[i][1];

			if (data[i][2] == 1) {
				count += people;
			} else {
				count -= people;
			}

			if (i < data.length - 1 && time == data[i + 1][0])
				continue;

			if (count > maxCount) {
				maxCount = count;
				maxTime = time;
			}
		}
		return maxTime;
	}

	static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
		HashMap<String, String> resultDict = new HashMap<>();
		helper("", dict, resultDict);
		return resultDict;
	}

	static void helper(String initialKey, Object dict, HashMap<String, String> resultDict) {
		for (Map.Entry<String, Object> entry : ((HashMap<String, Object>) dict).entrySet()) {
			String key = entry.getKey();
			Object val = entry.getValue();
			if (val instanceof String) {
				if (initialKey == null || initialKey.equals("")) {
					resultDict.put(key, val.toString());
				} else {
					resultDict.put(initialKey + "." + key, val.toString());
				}
			} else {
				if (initialKey == null || initialKey.equals("")) {
					helper(key, val, resultDict);
				} else {
					helper(initialKey + "." + key, val, resultDict);
				}
			}
		}
	}

}
