package com.jza.leet.aprilchallange.week4;

import java.util.HashMap;
import java.util.LinkedList;

public class LURCache {
	int capacity;

	HashMap<Integer, Integer> map;
	LinkedList<Integer> list = new LinkedList<>();

	public LURCache(int capacity) {
		this.capacity = capacity;
		map = new HashMap<>(capacity);
	}

	public int get(int key) {
		int value;
		if (map.containsKey(key)) {
			value = map.get(key);
		} else {


		}
		return 0;
	}

	public void put(int key, int value) {

	}

}
