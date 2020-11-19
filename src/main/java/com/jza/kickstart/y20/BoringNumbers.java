package com.jza.kickstart.y20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoringNumbers {
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
			System.out.println(parseOutput(i, countBoring(ints[0], ints[1])));
		}
	}

	public static int countBoring(int L, int R) {
		int count = 0;
		for (int i = L; i <= R; i++) {
			String numString = String.valueOf(i);
			boolean isBoring = true;
			for (int j = 0; j < numString.length(); j++) {
				boolean isOdd = ((int) numString.charAt(j)) % 2 == 1;
				boolean indexIsOdd = (j + 1) % 2 == 1;
				if (isOdd && indexIsOdd) {

				} else if (!isOdd && !indexIsOdd) {

				} else {
					isBoring = false;
					break;
				}
			}
			if (isBoring) {
				count++;
			}
		}
		return count;
	}


	public static String parseOutput(int testCase, int result) {
		return "Case #" + testCase + ": " + result;
	}

}
