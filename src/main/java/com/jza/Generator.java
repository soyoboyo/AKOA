package com.jza;

import java.util.concurrent.ThreadLocalRandom;

public class Generator {

	public static int[] generateArray(int size, int min, int max) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("i: " + i + ", val = " + array[i]);
		}
		System.out.println("===========================");
	}

}
