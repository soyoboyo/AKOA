package com.jza.codewars;

import java.util.HashMap;
import java.util.List;

public class BlackjackScorer {

	public int getBlackjackScore(List<String> cards) {
		int sum = 0, aces = 0;
		for (String card : cards) {
			if (card.equals("A")) {
				aces++;
			}
			sum += getValueOfCard(card);
		}
		while (aces > 0) {
			if (sum + 10 > 21) {
				return sum;
			}
			sum += 10;
			aces--;
		}
		return sum;
	}

	private Integer getValueOfCard(String card) {
		HashMap<String, Integer> cardValues = new HashMap<String, Integer>() {{
			put("J", 10);
			put("Q", 10);
			put("K", 10);
			put("A", 1);
		}};
		Integer value = cardValues.get(card);
		return value != null ? value : Integer.parseInt(card);
	}
}
