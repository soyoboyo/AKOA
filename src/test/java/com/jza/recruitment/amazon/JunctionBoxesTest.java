package com.jza.recruitment.amazon;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JunctionBoxesTest {

	@Test
	public void test() {

		String box = "asdf sagd asdgsadg sdfgasdgf";

		System.out.println(isOlderGeneration(box));
		System.out.println(isOlderGeneration("asd34 2134 4325"));
		System.out.println(isOlderGeneration("asdf 32134325"));

		assertEquals(1, 3);
	}

	private static boolean isOlderGeneration(String box) {
		String[] identifiers = box.split(" ", 2);
		System.out.println(identifiers[1]);
		return Pattern.compile("[0-9]").matcher(box).find();
	}
}
