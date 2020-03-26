package com.jza.dip.amazon;

import java.util.HashMap;
import java.util.Map;

public class HIndex {

	/*
		The h-index is a metric that attempts to measure the productivity and citation impact of the publication of a scholar. The definition of the h-index is if a scholar has at least h of their papers cited h times.

		Given a list of publications of the number of citations a scholar has, find their h-index.

		Example:

		Input: [3, 5, 0, 1, 3]
		Output: 3

		Explanation:
		There are 3 publications with 3 or more citations, hence the h-index is 3.

	 */

	public static int getHIndex(int[] citations) {
		int result = 0;
		Map<Integer, Integer> indexesCount = new HashMap<>();

		for (int i = 0; i < citations.length; i++) {
			int value = citations[i];
			Integer count = indexesCount.get(value);
			if (count == null) {
				indexesCount.put(value, 1);
			} else {
				indexesCount.put(value, count++);
				if (count >= value) {
					result = Math.max(result, indexesCount.get(value));
				}
			}
		}

		return result;
	}

}
