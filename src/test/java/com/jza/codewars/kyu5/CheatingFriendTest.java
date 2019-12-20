package com.jza.codewars.kyu5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheatingFriendTest {
	@Test
	public void test1() {
		List<long[]> res = new ArrayList<long[]>();
		res.add(new long[]{550320, 908566});
		res.add(new long[]{908566, 550320});
		res.add(new long[]{559756, 893250});
		res.add(new long[]{893250, 559756});
		List<long[]> a = CheatingFriend.isHeCheating(1000003);
		assertArrayEquals(res.get(0), a.get(0));
		assertArrayEquals(res.get(1), a.get(1));
	}

	@Test
	public void test2() {
		List<long[]> res = new ArrayList<long[]>();
		res.add(new long[]{28, 43});
		res.add(new long[]{43, 28});
		List<long[]> a = CheatingFriend.isHeCheating(50);
		assertArrayEquals(res.get(0), a.get(0));
		assertArrayEquals(res.get(1), a.get(1));
	}

	@Test
	public void test3() {
		List<long[]> res = new ArrayList<long[]>();
		res.add(new long[]{15, 21});
		res.add(new long[]{21, 15});
		List<long[]> a = CheatingFriend.isHeCheating(26);
		assertArrayEquals(res.get(0), a.get(0));
		assertArrayEquals(res.get(1), a.get(1));
	}

	@Test
	public void test4() {
		List<long[]> res = new ArrayList<long[]>();
		List<long[]> a = CheatingFriend.isHeCheating(100);
		assertTrue(res.size() == a.size());
	}


}
