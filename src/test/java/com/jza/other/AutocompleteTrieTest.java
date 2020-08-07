package com.jza.other;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AutocompleteTrieTest {
	@Test
	public void test() {
		AutocompleteTrie autocompleteTrie = new AutocompleteTrie();
		List<String> input = new ArrayList<>(Arrays.asList("dog", "dark", "cat", "door", "dodge"));
		String prefix = "do";
		autocompleteTrie.build(input);
		List<String> expected = new ArrayList<>();

//	  assertArrayEquals(expected, autocompleteTrie.autocomplete(prefix));
		autocompleteTrie.autocomplete(prefix);
	}
}
