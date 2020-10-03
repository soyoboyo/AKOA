package com.jza.kickstart.y20;

import com.jza.kickstart.KickstartFileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ATMQueue {

	public static void solution() throws IOException {
		BufferedReader br = KickstartFileReader.readInput();
		int numberOfTests = Integer.parseInt(br.readLine());
		for (int i = 1; i <= numberOfTests; i++) {
			String peopleAndLimitString = br.readLine();
			String valuesString = br.readLine();
			int limit = Integer.parseInt(peopleAndLimitString.split(" ")[1]);
			String[] values = valuesString.split(" ");
			int[] ints = new int[values.length];
			for (int j = 0; j < values.length; j++) {
				ints[j] = Integer.parseInt(values[j]);
			}
			System.out.println(parseOutput(i, getOrder(ints, limit)));
		}
	}

	public static String parseOutput(int testCase, int[] result) {
		String array = "";
		for (int i = 0; i < result.length; i++) {
			array += " " + result[i];
		}
		return "Case #" + testCase + ":" + array;
	}


	public static int[] getOrder(int[] people, int limit) {
		int[] order = new int[people.length];
		Queue<Integer> queue = new LinkedList<>();
		Map<Integer, Integer> indexes = new HashMap<>();
		for (int i = 0; i < people.length; i++) {
			queue.add(i + 1);
			indexes.put(i + 1, people[i]);
		}

		while (!queue.isEmpty()) {
			Integer index = queue.poll();
			Integer value = indexes.get(index);
			if (value > limit) {
				indexes.put(index, value - limit);
				queue.add(index);
			} else {
				order[people.length - queue.size() - 1] = index;
			}
		}
		return order;
	}

}

/*

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

    public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(br.readLine());

		for (int i = 1; i <= numberOfTests; i++) {
			String peopleAndLimitString = br.readLine();
			String valuesString = br.readLine();
			int limit = Integer.parseInt(peopleAndLimitString.split(" ")[1]);
			String[] values = valuesString.split(" ");
			int[] ints = new int[values.length];
			for (int j=0; j < values.length; j++) {
				ints[j] = Integer.parseInt(values[j]);
			}
			System.out.println(parseOutput(i, getOrder(ints, limit)));
		}
	}

	public static String parseOutput(int testCase, int[] result) {
		String array = "";
		for (int i = 0; i < result.length; i++) {
			array += " " + result[i];
		}
		return "Case #" + testCase + ":" + array;
	}


	public static int[] getOrder(int[] people, int limit) {
		int[] order = new int[people.length];
		Queue<Integer> queue = new LinkedList<>();
		Map<Integer, Integer> indexes = new HashMap<>();
		for (int i = 0; i < people.length; i++) {
			queue.add(i + 1);
			indexes.put(i + 1, people[i]);
		}
		while (!queue.isEmpty()) {
			Integer index = queue.poll();
			Integer value = indexes.get(index);
			if (value > limit) {
				indexes.put(index, value - limit);
				queue.add(index);
			} else {
				order[people.length - queue.size() - 1] = index;
			}
		}
		return order;
	}

}

 */
