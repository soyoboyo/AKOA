package com.jza.codewars.kyu5;


public class PrimeDecomp {
	public static String factors(int n) {
		StringBuilder sb = new StringBuilder();
		int previousPrime = 2;
		for (int i = 2; i <= n && n != 1; i++) {
			int counter = 0;
			while (isPrime(i, previousPrime) && n % i == 0) {
				n = n / i;
				counter++;
				previousPrime = i;
			}
			if (counter == 1) {
				sb.append("(" + i + ")");
			} else if (counter > 1) {
				sb.append("(" + i + "**" + counter + ")");
			}
		}
		return sb.toString();
	}

	private static boolean isPrime(int previousPrime, int n) {
		if (n <= 1) {
			return false;
		}
		if (n <= 3) {
			return true;
		}

		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		for (int i = previousPrime; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}
}
