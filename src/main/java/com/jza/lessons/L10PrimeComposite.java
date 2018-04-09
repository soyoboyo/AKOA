package com.jza.lessons;

public class L10PrimeComposite {

	public static int minPermieterRectangle(int N){
		int minPerimeter = 0;
		int limit = (int) Math.round(Math.sqrt(N));
		for (int i = 1; i <= limit; i++){

		}

		return minPerimeter;
	}

















	public static int countFactors(int N) {
		int factors = 0;
		int limit = (int) Math.round(Math.sqrt(N));
		for (int i = 1; i <= limit; i++) {
			if (N % i == 0) {
				factors++;
				int f = N / i;
				if (f != i) {
					factors++;
				}
			}
		}
		System.out.println("countFactors: " + factors);
		return factors;
	}

}
