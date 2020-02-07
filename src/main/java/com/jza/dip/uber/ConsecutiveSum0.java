package com.jza.dip.uber;

import java.util.LinkedList;

public class ConsecutiveSum0 {

	public static LinkedList<Integer> removeConsecutiveSumTo0(LinkedList<Integer> list) {
		LinkedList<Integer> resultList = new LinkedList<>();
		for (int i = 0; i < list.size(); i++) {
			int tempSum = 0;
			for (int j = i; j < list.size(); j++) {
				tempSum += list.get(j);
				if (tempSum == 0) {
					System.out.println("start " + i);
					System.out.println("end " + j);
					break;
				}
			}

			System.out.println("for " + i);
			System.out.println(tempSum);
			System.out.println("===================");
		}
		return list;
	}
}
