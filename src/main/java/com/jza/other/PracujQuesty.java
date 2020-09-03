package com.jza.other;

import java.util.Scanner;

public class PracujQuesty {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		String num = scanner.nextLine();
		String[] numersStr = {"0", "0", "0"};
		for (int i = 0; i < t; i++) {

			num = scanner.nextLine();
			numersStr = num.split(" ");
			int[] numers = {0, 0, 0};

			for (int j = 0; j < numersStr.length; j++) {
				numers[j] = Integer.parseInt(numersStr[j]);
			}

			System.out.println(printAns(numers[0], numers[1], numers[2]));
		}
		scanner.close();
	}

	private static String printAns(int c, int k, int w) {
		if (c * w <= k) {
			return "yes";
		} else {
			return "no";
		}
	}

}
