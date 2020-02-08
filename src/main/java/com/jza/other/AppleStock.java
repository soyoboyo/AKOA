package com.jza.other;

class AppleStock {

//	stock_prices = [10, 7, 5, 8, 11, 9]
//	get_max_profit(stock_prices)
//# Returns 6 (buying for $5 and selling for $11)

	public static int maxProfit(int[] prices) {
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			int buy = prices[i];
			for (int j = i; j < prices.length; j++) {
				int sell = prices[j];
				if (sell - buy > max) {
					max = sell - buy;
				}
			}
		}
		return max;
	}
}
