package com.jza.kickstart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {

	// REMOVE PACKAGE
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(br.readLine());
		for (int i = 1; i <= numberOfTests; i++) {
			String levelsRString = br.readLine();
			String[] values = levelsRString.split(" ");
			int[] ints = new int[values.length];
			for (int j = 0; j < values.length; j++) {
				ints[j] = Integer.parseInt(values[j]);
			}
			System.out.println("ANSWER");
		}
	}
}
