package com.jza.challenges.y2018;

import java.util.ArrayList;
import java.util.List;

public class ZalandoCards {

	public static int maxScore(int[] A, int[] B) {
		int score = 1;
		int scoreB = 1;
		int N = A.length;
		List<Integer> diffs = new ArrayList<>();
		List<Integer> q = new ArrayList<>(N);
		List<Integer> qB = new ArrayList<>(N);

		for (int i = 0; i < N; i++) {
			diffs.add(A[i] - B[i]);
			q.add(0);
			qB.add(0);
		}
		for (int i = 0; i < N; i++) {
			if (A[i] <= N) {
				q.set(A[i] - 1, q.get(A[i] - 1) + 1);
			}
			if (B[i] <= N) {
				qB.set(B[i] - 1, qB.get(B[i] - 1) + 1);
			}
		}


		for (int i = 0; i < N; i++) {
			if (q.get(i) != 0) {
				score++;
			} else if (q.get(i) == 0) {
				break;
			}
		}
		for (int i = 0; i < N; i++) {
			if (qB.get(i) != 0) {
				scoreB++;
			} else if (qB.get(i) == 0) {
				break;
			}
		}
		return Math.max(score, scoreB);
	}

}
