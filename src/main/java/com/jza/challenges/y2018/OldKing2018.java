package com.jza.challenges.y2018;

import java.util.Arrays;

public class OldKing2018 {

	public static int solution(int N, int M, int[] X, int[] Y) {
		int counter = 0;
		int limit = N + M - 2;
		if (0 >= limit) {
			return 0;
		}
		if(X.length%2 == 1){
			return 0;
		}
		Arrays.sort(X);
		Arrays.sort(Y);

		int lMid = X.length/2 -1;
		int rMid = X.length/2;

		for (int divV = 1; divV < N; divV++) {
			if(X[lMid] < divV && X[rMid] >= divV){
				counter++;
			}
		}
		for (int divH = 1; divH < M; divH++) {
			if(Y[lMid] < divH && Y[rMid] >= divH){
				counter++;
			}
		}

		return counter;
	}
}
//	public static int solution(int N, int M, int[] X, int[] Y) {
//		int counter = 0;
//		int limit = N + M - 2;
//		if (0 >= limit) {
//			return 0;
//		}
//		if(X.length%2 == 1){
//			return 0;
//		}
//		for (int divV = 1; divV < N; divV++) {
//			int onTheLeft = 0;
//			for (int i = 0; i < X.length; i++) {
//				int boroughX = X[i];
//
//				if (boroughX < divV){
//					onTheLeft++;
//				}
//			}
//			if(onTheLeft == X.length/2){
//				counter++;
//			}
//		}
//		for (int divH = 1; divH < M; divH++) {
//			int onTop = 0;
//			for (int i = 0; i < Y.length; i++) {
//				int boroughY = Y[i];
//				if (boroughY < divH){
//					onTop++;
//				}
//			}
//			if(onTop == Y.length/2){
//				counter++;
//			}
//		}
//
//		return counter;
//	}