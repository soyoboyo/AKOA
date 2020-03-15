package com.jza.euler;

public class Euler5 {

	// 1
	public static int multipliesOf3Or5(int n) {
		//	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		//	Find the sum of all the multiples of 3 or 5 below 1000.

		int sum = 0;
		int i = 3;
		while (i < n) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
			i++;
		}
		return sum;
	}

	// 3
	public static int largestPrimeFactor(int n) {
//		The prime factors of 13195 are 5, 7, 13 and 29.
//		What is the largest prime factor of the number 600851475143 ?
		int lpm = 0;
		return 0;

	}
}
