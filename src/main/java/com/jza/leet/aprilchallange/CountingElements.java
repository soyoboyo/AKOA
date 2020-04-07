package com.jza.leet.aprilchallange;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountingElements {
	public static int countElements(int[] arr) {
		int result = 0;
		Arrays.sort(arr);
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (!map.containsKey(x)) {
				map.put(x, 1);
			} else {
				map.put(x, map.get(x) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> count : map.entrySet()) {
			if (map.containsKey(count.getKey() + 1)) {
				result += map.get(count.getKey());
			}
		}
		return result;
	}

}
