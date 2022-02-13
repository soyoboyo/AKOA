package com.jza.swissquote;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
The goal is to implement the body of 2 methods and run against some test cases which have already been added in the main method.
 */
public class SwissQuoteSolution {

	// A Quote is a set of prices for a financial product (e.g. share, option, bond), given by a data provider.
	// Such products are identified by ISIN code.
	private static class Quote {
		// the identifier of the financial product being quoted
		String isin;

		// prices of various types
		BigDecimal bid;
		BigDecimal ask;
		BigDecimal last;
		BigDecimal close;

		// metadata regarding the price source (e.g. Reuters, Bloomberg, etc.)
		String provider;

		public Quote(String isin, BigDecimal bid, BigDecimal ask, BigDecimal last, BigDecimal close, String provider) {
			this.isin = isin;
			this.bid = bid;
			this.ask = ask;
			this.last = last;
			this.close = close;
			this.provider = provider;
		}
	}

	// we receive the following dta for 3 shares from our providers
	public static List<Quote> ALL_QUOTES = Arrays.asList(

			// quotes for share 1 (ABBN)
			new Quote("CH0012221716", BigDecimal.valueOf(100), BigDecimal.valueOf(101), null, null, "Reuters"),
			new Quote("CH0012221716", BigDecimal.valueOf(100), BigDecimal.valueOf(101), BigDecimal.valueOf(99), null, "Bloomberg"),
			new Quote("CH0012221716", BigDecimal.valueOf(100), BigDecimal.valueOf(101), BigDecimal.valueOf(100), BigDecimal.valueOf(99), "SIX"),

			// quotes for share 2 (NESN)
			new Quote("CH0038863350", null, null, BigDecimal.valueOf(150), null, "Reuters"),
			new Quote("CH0038863350", BigDecimal.valueOf(149), BigDecimal.valueOf(150), BigDecimal.valueOf(150), BigDecimal.valueOf(152), "Bloomberg"),
			new Quote("CH0038863350", BigDecimal.valueOf(149), BigDecimal.valueOf(150), BigDecimal.valueOf(150), null, "SIX"),


			// quotes for share 3 (Vienna Airport)
			new Quote("AT00000VIE62", BigDecimal.valueOf(27), null, null, null, "Reuters"),
			new Quote("AT00000VIE62", BigDecimal.valueOf(27), null, null, null, "SIX")

	);

	/**
	 * Exercise 1: Given a list of Quotes from our provider, return only those Quotes that have a CLOSE price.
	 */
	public static List<Quote> selectQuotesWithClosePrice(List<Quote> rawQuotes) {
		// TODO: implement
		return Collections.emptyList();
	}

	/**
	 * Exercise 2: Given a list of Quotes, return at most one quote containing CLOSE price for each product (identified by ISIN), *if it exists*. If not, it's OK to return nothing (null) for this product/ISIN.
	 */
	public static Map<String, Quote> selectQuotesWithClosePricePerProduct(List<Quote> rawQuotes) {

		// TODO: implement
		return Collections.emptyMap();
	}

	////////////////////////////////////////////////////////////////////
	// IGNORE CLOSE BELOW, IT IS ONLY RUNNING AND TESTING
	public static void main(String[] args) {
		// Exercise 1
		System.out.println("Exercise 1:");
		List<Quote> quotesWithClose = selectQuotesWithClosePrice(ALL_QUOTES);
		checkInt(2, quotesWithClose.size());
		checkBoolean(true, quotesWithClose.stream().filter(quote -> "CH0012221716".equals(quote.isin)).findFirst().get().provider.equals("SIX"));
		checkBoolean(true, quotesWithClose.stream().filter(quote -> "CH0038863350".equals(quote.isin)).findFirst().get().provider.equals("Bloomberg"));

		// Exercise 2
		System.out.println("Exercise 2");
		Map<String, Quote> quotesWithClosePerIsin = selectQuotesWithClosePricePerProduct(ALL_QUOTES);
		checkInt(2, quotesWithClosePerIsin.size());
		checkBoolean(true, quotesWithClosePerIsin.get("CH0012221716") != null && quotesWithClosePerIsin.get("CH0012221716").provider.equals("SIX"));
		checkBoolean(true, quotesWithClosePerIsin.get("CH0038863350") != null && quotesWithClosePerIsin.get("CH0038863350").provider.equals("Bloomberg"));

	}

	private static void checkInt(int expected, int actual) {
		if (expected != actual) {
			System.out.println("Check OK");
		} else {
			System.out.println("Check FAILED, expected " + expected + " but got " + actual);
		}
	}

	private static void checkBoolean(boolean expected, boolean actual) {
		if (expected != actual) {
			System.out.println("Check OK");
		} else {
			System.out.println("Check FAILED, expected " + expected + " but got " + actual);
		}
	}

}
