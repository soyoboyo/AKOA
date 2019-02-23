package com.jza.challenges.y2018;

import java.util.ArrayList;
import java.util.List;

public class CuttingComplexity2018 {

	public static int longestInterval(String S, int K) {
		int swaps = 0;
		int max = 0;
		List<Integer> lengths = new ArrayList<>();
		int M = 0, L = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'M') {
				M++;
				if (M > max) {
					max = M;
				}
				if (L != 0) {
					lengths.add(L);
					L = 0;
				}
			} else if (S.charAt(i) == 'L') {
				L++;
				if (M != 0) {
					lengths.add(M);
					M = 0;
				}
			}

		}
		if (L != 0) {
			lengths.add(L);
		}
		if (M != 0) {
			lengths.add(M);
		}

		int current;
		int min = 0, biggestMin = Integer.MIN_VALUE, switches = 0;
		if (max > K) {
			for (int j = S.charAt(0) == 'M' ? 0 : 1; j < lengths.size(); j = j + 2) {
				current = lengths.get(j);
				if (current > K) {
					swaps += (current - 1) / K;
				}
			}
		} else if (max < K) {
			swaps = K - max;
			for (int m = 0; m < lengths.size(); m++) {
				min = lengths.get(m);
				for (int n = m + 1; n < lengths.size(); n++) {
					if (biggestMin < K && min <= K) {
						min += lengths.get(n);
						if (min > biggestMin) {
							biggestMin = min;
							switches++;
						}
					}
				}
			}
			swaps = Math.min(K - max, biggestMin - (switches - 1)/2 );

		}

		return swaps;

	}
//	public static int longestInterval(String S, int K) {
//		int swaps = 0, minSwaps = Integer.MAX_VALUE;
//		int l = 0;
//		int longest = 0;
//		int prevM = 0;
//		int prevL = 0;
//		int sumWithGap = 0;
//		for (int i = 0; i < S.length(); i++) {
//			if (S.charAt(i) == 'M') {
//				l++;
//				longest = l > longest ? l : longest;
//				prevM = l;
//				if (l > K) {
//					swaps++;
//					l = 0;
//					i++;
//					prevM = 0;
//				}
//			} else if(S.charAt(i) == 'L') {
//				if (prevM > 0) {
//					sumWithGap = prevL + prevM + l;
//					if (sumWithGap == K) {
//						minSwaps = prevL < minSwaps ? prevL : minSwaps;
//					}
//				} else {
//					prevL++;
//				}
//				l = 0;
//			}
//		}
//		if (longest < K) {
//			swaps += K - longest;
//		}
//		System.out.println(minSwaps);
//		return swaps;
//
//	}

}
