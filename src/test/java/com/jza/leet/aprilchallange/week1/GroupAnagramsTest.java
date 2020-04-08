package com.jza.leet.aprilchallange.week1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {

	@Test
	public void test1() {
		List<List<String>> expected = new ArrayList<>();
		expected.add(Arrays.asList("eat", "tea", "ate"));
		expected.add(Arrays.asList("tan", "nat"));
		expected.add(Arrays.asList("bat"));
		List<List<String>> result = GroupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
		assertAll(() -> {
			assertEquals(expected.get(0), result.get(0));
			assertEquals(expected.get(1), result.get(1));
			assertEquals(expected.get(2), result.get(2));
		});
	}

	@Test
	public void test2() {
		List<List<String>> expected = new ArrayList<>();
		expected.add(Arrays.asList("", ""));
		List<List<String>> result = GroupAnagrams.groupAnagrams(new String[]{"", ""});
		assertAll(() -> {
			assertEquals(expected.get(0), result.get(0));
		});
	}

	@Test
	public void test3() {
		List<List<String>> expected = new ArrayList<>();
		expected.add(Arrays.asList("", ""));
		expected.add(Arrays.asList("ate", "eat"));
		List<List<String>> result = GroupAnagrams.groupAnagrams(new String[]{"", "", "ate", "eat"});
		assertAll(() -> {
			assertEquals(expected.get(0), result.get(0));
			assertEquals(expected.get(1), result.get(1));
		});
	}

}
