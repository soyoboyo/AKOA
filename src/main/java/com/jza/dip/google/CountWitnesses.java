package com.jza.dip.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountWitnesses {
	public static List<Integer> getWitnesses(int[] heights) {
		int max = heights[heights.length - 1];
		List<Integer> witnesses = new ArrayList<>();
		witnesses.add(max);
		for (int i = heights.length - 2; i >= 0; i--) {
			int height = heights[i];
			if (height > max) {
				witnesses.add(height);
				max = height;
			}
		}
		Collections.reverse(witnesses);
		return witnesses;
	}
}
