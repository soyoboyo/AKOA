package com.jza.algoexpert;

public class Algo1 {

	public static boolean globMatching(String fileName, String pattern) {
		boolean[][] matrix = new boolean[fileName.length() + 1][pattern.length() + 1];

		for (int i = 1; i <= fileName.length(); i++) {
			for (int j = 1; j <= pattern.length(); j++) {
				char f = fileName.charAt(i-1);
				char p = pattern.charAt(j-1);
				matrix[i][j] = isMatch(f, p);
			}
		}
		System.out.println(matrix);
		return true;
	}

	public static boolean isMatch(char f, char p) {
		return f == p || p == '?' || p == '*';
	}

}
