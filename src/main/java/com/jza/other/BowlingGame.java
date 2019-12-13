package com.jza.other;

import java.util.List;

public class BowlingGame {

	public int getScore(List<String> rounds) {
		int result = 0;
		for (int i = 0; i < 10; i++) {
			String round = rounds.get(i);
			String nextRound = (i < 9) ? rounds.get(i + 1) : rounds.get(9);
			Character firstRoll = round.charAt(0), secondRoll;

			if (i < 9) {
				if (round.contains("X")) {
					result += 10;
					if (i < 8) {
						result += getPointsFromTwoNextRolls(nextRound, rounds.get(i + 2));
					} else {
						result += getPointsFromTwoNextRolls9(nextRound);
					}
				} else {
					secondRoll = round.charAt(1);
					int firstRollPoints = parseRolls(firstRoll, secondRoll);
					result += firstRollPoints + parseRolls(secondRoll, firstRollPoints);
					if (round.charAt(1) == '/') {
						result += parseRoll(nextRound.charAt(0));
					}
				}
			} else {
				if (round.contains("X")) {
					result += 10;
					result += parseRoll(round.charAt(1));
					result += parseRolls(round.charAt(2), parseRoll(round.charAt(1)));
				} else {
					int firstRollPoints = parseRoll(round.charAt(0));
					result += firstRollPoints;
					result += parseRolls(round.charAt(1), firstRollPoints);
					if (round.length() == 3) {
						result += parseRoll(round.charAt(2));
					}
				}
			}
			System.out.println(result);
		}
		return result;
	}

	private int getPointsFromTwoNextRolls(String nextRound, String secondRound) {
		int sum = 0;
		if (nextRound.charAt(0) == 'X') {
			sum += 10;
			if (secondRound.charAt(0) == 'X') {
				sum += 10;
			} else {
				sum += Integer.parseInt(String.valueOf(secondRound.charAt(0)));
			}
		} else {
			int previous = Integer.parseInt(String.valueOf(nextRound.charAt(0)));
			sum += previous;
			sum += parseRolls(nextRound.charAt(1), previous);
		}
		return sum;
	}

	private int getPointsFromTwoNextRolls9(String lastRound) {
		int firstRoll = parseRoll(lastRound.charAt(0));
		int secondRoll = parseRolls(lastRound.charAt(1), firstRoll);
		return firstRoll + secondRoll;
	}

	private int parseRolls(Character roll, int previousRoll) {
		if (roll.equals('X')) {
			return 10;
		} else if (roll.equals('-')) {
			return 0;
		} else if (roll.equals('/')) {
			return 10 - previousRoll;
		} else {
			return Integer.parseInt(String.valueOf(roll));
		}
	}

	private int parseRoll(Character roll) {
		if (roll.equals('X')) {
			return 10;
		} else if (roll.equals('-')) {
			return 0;
		} else {
			return Integer.parseInt(String.valueOf(roll));
		}
	}

}
