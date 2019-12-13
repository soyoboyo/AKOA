package com.jza.codewars.kyu5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheatingFriendTest {
	@Test
	public void test12() {
		List<long[]> res = new ArrayList<long[]>();
		res.add(new long[]{15, 21});
		res.add(new long[]{21, 15});
		List<long[]> a = CheatingFriend.isHeCheating(26);
		assertArrayEquals(res.get(0), a.get(0));
		assertArrayEquals(res.get(1), a.get(1));
	}

	@Test
	public void test14() {
		List<long[]> res = new ArrayList<long[]>();
		List<long[]> a = CheatingFriend.isHeCheating(100);
		assertTrue(res.size() == a.size());
	}

	@Test
	public void test1() {
		List<long[]> res = new ArrayList<long[]>();
		res.add(new long[]{6, 7});
		res.add(new long[]{7, 6});
		List<long[]> a = CheatingFriend.isHeCheating(10);
		assertArrayEquals(res.get(0), a.get(0));
		assertArrayEquals(res.get(1), a.get(1));
	}
}
