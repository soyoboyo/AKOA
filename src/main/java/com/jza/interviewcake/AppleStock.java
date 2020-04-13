package com.jza.interviewcake;

class AppleStock {

//	stock_prices = [10, 7, 5, 8, 11, 9]
//	get_max_profit(stock_prices)
//# Returns 6 (buying for $5 and selling for $11)

	public static int maxProfit(int[] prices) {
		int minPrice = prices[0];
		int maxProfit = prices[1] - prices[0];
		for (int i = 1; i < prices.length; i++) {
			int currentPrice = prices[i];
			int potentialProfit = currentPrice - minPrice;
			minPrice = Math.min(currentPrice, minPrice);
			maxProfit = Math.max(maxProfit, potentialProfit);
		}
		return maxProfit;
	}
}
