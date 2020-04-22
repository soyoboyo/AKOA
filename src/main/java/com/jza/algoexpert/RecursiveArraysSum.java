package com.jza.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class RecursiveArraysSum {

	public static int productSum(List<Object> array) {
		int sum = 0;
		for (Object x : array) {
			if (x instanceof ArrayList) {
				sum += getDepth(x, 1);
			} else {
				sum += (Integer) x;
			}
		}
		return sum;
	}

	public static int getDepth(Object x, int depth) {
		if (x instanceof ArrayList) {
			int sum = 0;
			for (Object n : (ArrayList) x) {
				sum += (Integer) getDepth(n, depth + 1);
			}
			return sum * depth;
		} else {
			return (Integer) x * depth;
		}
	}

}
