package com.jza.dip.amazon;

public class HIndex {

	/*
		The h-index is a metric that attempts to measure the productivity and citation impact of the publication of a scholar. The definition of the h-index is if a scholar has at least h of their papers cited h times.

		Given a list of publications of the number of citations a scholar has, find their h-index.

		Example:

		Input: [3, 5, 0, 1, 3]
		Output: 3

		Explanation:
		There are 3 publications with 3 or more citations, hence the h-index is 3.

	----------------------------------
	An approach to this problem is to sort the publications by number of citations, and the first index such that publications[i] < i would be the h-index.

	Example:
	[5, 3, 3, 1, 0]

	With the publications sorted, the expression holds true until i = 3, and thus the h-index is 3.

	This would give us a O(n log n) time complexity, however we can do better by being smarter with the sorting.

	Note that the upper bound of the h-index of a scholar is the number of publications they've done. Thus citations greater than n are guaranteed to be considered in the h-index. Therefore for all items greater than n can be in the same 'bucket'. The other buckets would be the numbers from 0 to n.

	After sorting, we use the same logic as above to find the h-index.


	The time complexity of this solution is O(n), as there is at most n elements in citations.

	The space complexity is O(n) to do bucket sort.
	 */

	public static int getHIndex(int[] publications) {
		int len = publications.length;
		int[] citations = new int[len + 1];

		for (int i = 0; i < publications.length; i++) {
			int pub = publications[i];
			if (pub < len) {
				citations[pub]++;
			} else {
				citations[len]++;
			}
		}

		int total = 0;
		int i = len;
		while (i >= 0) {
			total += citations[i];
			if (total >= i) {
				return i;
			}
			i--;
		}

		return i;
	}

	/* n logn solution

	Arrays.sort(publications);
	int count = 0;
	for (int i = publications.length - 1; i >= 0; i--) {
		count++;
		if(count >= publications[i]){
			return publications[i];
		}
	}

	 */
}
