package com.jza;

public class GoogleFoobar {
	public static String level1(int i) {
		int n = 20225;
		boolean[] isPrime = new boolean[n + 1];
		StringBuilder result = new StringBuilder();
		for (int x = 2; x <= n; x++) {
			isPrime[x] = true;
		}
		for (int factor = 2; factor * factor <= n; factor++) {
			if (isPrime[factor]) {
				for (int j = factor; factor * j <= n; j++) {
					isPrime[factor * j] = false;
				}
			}
		}
		for (int j = 0; j < isPrime.length && result.length() < i + 5; j++) {
			if (isPrime[j]) {
				result.append(j);
			}
		}
		System.out.println(result.length());
		return result.substring(i, i + 5);
	}

	public static int[] level2(int[] pegs) {
		int len = pegs.length;
		int[] failure = new int[]{-1, -1};
		int[] diffs = new int[len - 1];

		for (int i = 0; i < len - 1; i++) {
			diffs[i] = pegs[i + 1] - pegs[i];
			if (diffs[i] < 2) {
				return failure;
			}
		}
		if (len == 2) {
			if (diffs[0] % 3 == 0) {
				return new int[]{diffs[0] / 3, 1};
			} else {
				return new int[]{diffs[0], 3};
			}
		}
		int sum = 0;
		for (int i = 0; i < len - 1; i++) {
			if (i % 2 == 0) {
				sum += diffs[i];
			} else {
				sum -= diffs[i];
			}

		}
		if (sum < 0) {
			return failure;
		}
		int a = sum * 2;
		int b = 1;
		if (len % 2 == 0) {
			if (sum % 3 == 0) {
				a = a / 3;
			} else {
				b = 3;
			}
		}
		return new int[]{a, b};
	}

	public static int[] level2a(int[] pegs) {
		// do the inductive math
		int a = pegs[0];
		int flip = -1;
		for (int peg : pegs) {
			a += 2 * peg * flip;
			flip *= -1;
		}
		a += pegs[pegs.length - 1] * flip;
		a *= 2;
		int b = (pegs.length % 2 == 0) ? 3 : 1;

		// reduce
		if (a % b == 0) {
			a /= b;
			b = 1;
		}

		// reject bad values
		float prevR = ((float) a) / ((float) b);
		for (int i = 0; i < pegs.length - 2; i++) {
			int width = pegs[i + 1] - pegs[i];
			if (prevR < 0 || prevR > (width - 1)) return new int[]{-1, -1};
			prevR = width - prevR;
		}

		return new int[]{a, b};
	}

	public static int level2b(int total_lambs) {
		if (total_lambs < 10 || total_lambs > 1000000000) {
			return 0;
		} else return maxMinions(total_lambs) - minMinions(total_lambs);
	}

	static int minMinions(int totalLambs) {
		int fib = 0;
		int sum = 0;
		int fibCount = 0;
		while (sum + fib * 2 <= totalLambs) {
			if (fib == 0) {
				fib = 1;
			} else fib = fib * 2;
			sum += fib;
			fibCount++;
		}
		if (totalLambs - sum >= fib + fib / 2) {
			return fibCount + 1;
		} else return fibCount;
	}

	static int maxMinions(int totalLambs) {
		int fib = 0;
		int prevFib = 1;
		int sum = 0;
		int fibCount = 0;
		while (sum + fib + prevFib <= totalLambs) {
			fib = fib + prevFib;
			prevFib = fib - prevFib;
			sum += fib;
			fibCount++;
		}
		return fibCount;
	}

}
