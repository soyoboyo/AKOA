package com.jza.kickstart.y20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Retype {
	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(br.readLine());
		for (int i = 1; i <= numberOfTests; i++) {
			String levelsRString = br.readLine();
			String[] values = levelsRString.split(" ");
			int[] ints = new int[values.length];
			for (int j = 0; j < values.length; j++) {
				ints[j] = Integer.parseInt(values[j]);
			}
			System.out.println(parseOutput(i, getMinutes(ints[0], ints[1], ints[2])));
		}
	}

	public static int getMinutes(int maxLvl, int currLvl, int swordLvl) {
		// N K S
		// k + min(n, abs(k - s) + n - s)
		// return  currLvl + Math.min(maxLvl, Math.abs(currLvl  - swordLvl) + maxLvl - swordLvl);
		int goBack = (currLvl - swordLvl) + (maxLvl - swordLvl);
		return currLvl + Math.min(maxLvl, goBack);
	}


	public static String parseOutput(int testCase, int result) {
		return "Case #" + testCase + ": " + result;
	}

}
