package com.jza.algoexpert;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Algo4 {


	public int minimumWaitingTime(int[] queries) {
		Map<Integer, Integer> count = new TreeMap<>();

		for (int q : queries) {
			count.merge(q, 1, Integer::sum);
		}


		int waitingTimeSum = 0;
		int queriesLeft = queries.length - 1;
		for (Map.Entry<Integer, Integer> query : count.entrySet()) {
			Integer waitingTime = query.getKey();
			Integer queryCount = query.getValue();
			for (int i = 0; i < queryCount; i++) {
				waitingTimeSum += queriesLeft * waitingTime;
				queriesLeft--;
			}
		}

		return waitingTimeSum;
	}

}
