package com.jza.codewars.kyu6;

import java.util.*;


public class BooksellerHelp {
	// https://www.codewars.com/kata/help-the-bookseller
	public static String stockSummary(String[] books, String[] categories) {
		if (books.length == 0) {
			return "";
		}
		Set<String> cat = new HashSet<>(Arrays.asList(categories));
		Map<String, Integer> stockMap = fillMap(categories);
		for (String book : books) {
			String bookCategory = book.substring(0, 1);
			if (cat.contains(bookCategory)) {
				stockMap.put(bookCategory, stockMap.get(bookCategory) + getNumber(book));
			}
		}
		return convertFormat(stockMap);
	}

	private static Map<String, Integer> fillMap(String[] values) {
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String v : values) {
			map.put(v, 0);
		}
		return map;
	}

	private static String convertFormat(Map<String, Integer> solution) {
		List<String> list = new LinkedList<>();
		for (Map.Entry<String, Integer> entry : solution.entrySet()) {
			list.add("(" + entry.getKey() + " : " + entry.getValue() + ")");
		}
		return String.join(" - ", list);
	}

	private static int getNumber(String book) {
		return Integer.parseInt(book.split(" ")[1]);
	}
}
