package com.jza.snippets;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class CodeSnippets {

	public static void snippet() {
		int[] array = {1, 2, 3};
		List<Integer> input = new ArrayList<>();

		Map<Integer, Integer> collect =
				input.stream()
						.collect(groupingBy(Function.identity(), summingInt(e -> 1)));

	}

	public static void main(String[] args) {
		Map<String, List<Integer>> map = new HashMap<>();
		List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2));
		List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 5, 6));
		List<Integer> l3 = new ArrayList<>();
		map.put("l1", l1);
		map.put("l2", l1);
		map.put("l3", l1);
		System.out.println(map.values().stream().mapToInt(List::size).sum());
	}

}
