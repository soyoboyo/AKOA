package com.jza.leet.aprilchallange.week1;

public class BuySellStock2 {
	public static int maxProfit(int[] prices) {
//		int minPrice = prices[0];
//		int maxProfit = prices[1] - prices[0];
//		for (int i = 1; i < prices.length; i++) {
//			int currentPrice = prices[i];
//			int potentialProfit = currentPrice - minPrice;
//			minPrice = Math.min(currentPrice, minPrice);
//			maxProfit = Math.max(maxProfit, potentialProfit);
//		}
//		return maxProfit;

		int maxProfit = 0, len = prices.length;
		for (int i = 1; i < len; i++) {
			int p = prices[i];
			if (p > prices[i - 1]) {
				maxProfit += p - prices[i - 1];
			}
		}
		return maxProfit;
	}
}
