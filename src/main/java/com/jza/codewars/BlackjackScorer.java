package com.jza.codewars;

import java.util.HashMap;
import java.util.List;

public class BlackjackScorer {

	public int getBlackjackScore(List<String> cards) {
		Integer sumWithoutAce = 0;
		Integer acesCount = 0;
		for (String card : cards) {
			if (card.equals("A")) {
				acesCount++;
			} else {
				sumWithoutAce += getValueOfCard(card);
			}
		}
		if (acesCount == 0) {
			return sumWithoutAce;
		}
		if (sumWithoutAce + 11 * acesCount == 21) {
			return 21;
		}
		if (sumWithoutAce + acesCount >= 21) {
			return sumWithoutAce + acesCount;
		}

		int sum = sumWithoutAce;
		int aces = acesCount;
		for (int i = 0; i < acesCount; i++) {
			sum++;
			aces--;
			if (sum + 1 >= 21 && aces == 0) {
				return sum + aces;
			}
		}
		aces = acesCount;
		for (int i = 0; i < acesCount; i++) {
			if (sum + 10 >= 21 || aces == 0) {
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
			put("A", 0);
		}};
		Integer value = cardValues.get(card);
		return value != null ? value : Integer.parseInt(card);
	}


}
