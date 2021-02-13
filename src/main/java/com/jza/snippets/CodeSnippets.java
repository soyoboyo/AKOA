package com.jza.snippets;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

}
