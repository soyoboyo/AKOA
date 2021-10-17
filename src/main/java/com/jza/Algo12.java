package com.jza;

import java.util.*;
import java.util.stream.IntStream;

public class Algo12 {

	public int missingNumber(int[] nums) {
		// 0, 1, 2 -> 3
		// 3
		// 0, 1, 3 -> 2
		// total: 4, math: 6

		// 1 -> 1
		// 0
		// total: 1, math: 1

		int sum = (nums.length * (nums.length + 1)) / 2;
		int actualSum = IntStream.of(nums).sum();

		if (sum > actualSum) {
			return sum - actualSum;
		} else if (sum == actualSum) {
			return 0;
		}

		return nums.length;
	}

	public int maxLengthBetweenEqualCharacters(String s) {
		// cbcxybc
		// max = -1
		// map<char, int> firstIndex
		// c: 0, b: 1, c: 2, ..., c: 5
		// if char repeated -> update max (currentIndex - firstIndex - 1)
		int max = -1;
		Map<Character, Integer> firstIndex = new HashMap<>();
		for (int i = 0; i < s.toCharArray().length; i++) {
			char c = s.charAt(i);
			if (firstIndex.get(c) == null) {
				firstIndex.put(c, i);
			} else {
				max = Math.max(max, i - firstIndex.get(c) - 1);
			}
		}
		return max;

	}


	public int maxNumberOfBalloons(String text) {
		// nlaebolko
		// collected: a: 1, b: 1, l: 2 ....
		// required: a: 1, b: 1, l: 2, o: 2, n: 1
		// maxPossibleWords
		// iterate over collected
		// collected.get(x) > required.get(x)
		// maxPossible = Math.min(maxPossible, collected.get(x)/required.get(x)
		// return maxPossible
		Map<Character, Integer> required = new HashMap<Character, Integer>() {{
			put('b', 1);
			put('a', 1);
			put('l', 2);
			put('o', 2);
			put('n', 1);
		}};
		Map<Character, Integer> collected = new HashMap<>();
		for (char c : text.toCharArray()) {
			if (required.get(c) != null) {
				collected.merge(c, 1, Integer::sum);
			}
		}

		if (required.size() > collected.size()) {
			return 0;
		}

		int maxPossible = Integer.MAX_VALUE;
		for (Map.Entry<Character, Integer> e : collected.entrySet()) {
			maxPossible = Math.min(
					maxPossible,
					e.getValue() / required.get(e.getKey())
			);

		}
		return maxPossible;
	}


	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

		// nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
		// nums1 -> 1: 1, 2: 1, 3: 1
		// nums2 -> 1: 1, 2: 2, 3: 2


		Map<Integer, Integer> m1 = checkExistence(nums1);
		Map<Integer, Integer> m2 = checkExistence(nums2);
		Map<Integer, Integer> m3 = checkExistence(nums3);
		Set<Integer> unique = new HashSet<>();
		for (Map.Entry<Integer, Integer> e : m1.entrySet()) {
			int n = e.getKey();
			if (m2.get(n) != null || m3.get(n) != null) {
				unique.add(n);
			}
		}
		for (Map.Entry<Integer, Integer> e : m2.entrySet()) {
			int n = e.getKey();
			if (m1.get(n) != null || m3.get(n) != null) {
				unique.add(n);
			}
		}
		for (Map.Entry<Integer, Integer> e : m3.entrySet()) {
			int n = e.getKey();
			if (m2.get(n) != null || m1.get(n) != null) {
				unique.add(n);
			}
		}
		return new ArrayList<>(unique);
	}


	public static Map<Integer, Integer> checkExistence(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.putIfAbsent(nums[i], 1);
		}
		return map;
	}

	public int numIdenticalPairs(int[] nums) {
		// [1,2,3,1,1,3]
		// 1: 0, 3, 4
		// 2: 1
		// 3: 2, 5

		Map<Integer, List<Integer>> indexes = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int size = nums[i];
			indexes.computeIfAbsent(size, k -> new ArrayList<>()).add(i);
		}

		int result = 0;

		for (Map.Entry<Integer, List<Integer>> e : indexes.entrySet()) {
			List<Integer> idxs = e.getValue();
			for (int i = 0; i < idxs.size(); i++) {
				for (int j = i + 1; j < idxs.size(); j++) {
					result++;
				}
			}
		}
		return result;
	}


	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		// [3,3,3,3,3,1,3]
		// 1: [5]
		// 3: [0, 1, 2, 3, 4, 6]
		// 3: 0, 1, 2
		// 3: 3, 4, 6


		// [3,3,1]
		// 1: [2]
		// 3: [0, 1]
		// 3: 0, 1, 2
		// 3: 3, 4, 6

		Map<Integer, List<Integer>> indexes = new HashMap<>();
		for (int i = 0; i < groupSizes.length; i++) {
			int size = groupSizes[i];
			indexes.computeIfAbsent(size, k -> new ArrayList<>()).add(i);
		}

		List<List<Integer>> result = new ArrayList<>();
		for (Map.Entry<Integer, List<Integer>> e : indexes.entrySet()) {
			List<Integer> idxs = e.getValue();
			int groupSize = e.getKey();
			for (int i = 0; i < idxs.size(); i += groupSize) {
				if (i + groupSize < idxs.size())
					result.add(idxs.subList(i, i + groupSize));
			}
		}

		return result;
	}


	public static int subtractProductAndSum(int n) {
		int sum = 0;
		int product = 1;
		while (n > 0) {
			sum += n % 10;
			product *= n % 10;
			n = n / 10;
		}

		return product - sum;
	}

}
