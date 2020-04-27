package com.jza.leet.aprilchallange.week4;

public class LongestCommonSubsequence {

	public static String getLongestCommonSubsequence(String s1, String s2) {
		int n = s1.length(), k = s2.length();
		String[][] dp = new String[n + 1][k + 1];

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < k + 1; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = "";
				} else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + s1.charAt(i - 1);
				} else {
					String up = dp[i - 1][j];
					String left = dp[i][j - 1];
					dp[i][j] = up.length() > left.length() ? up : left;
				}
			}
		}
		return dp[n][k];
	}
}
