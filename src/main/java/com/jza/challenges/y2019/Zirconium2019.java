package com.jza.challenges.y2019;

import java.util.*;

public class Zirconium2019 {

	// https://app.codility.com/programmers/custom_challenge/zirconium2019/

	public class Developer implements Comparable<Developer> {
		int fe;
		int be;

		public Developer(int fe, int be) {
			this.fe = fe;
			this.be = be;
		}

		@Override
		public int compareTo(Developer o) {
			return Integer.compare(this.fe, o.fe);
		}

	}

	public int maxContribution(int[] A, int[] B, int F) {

		List<Developer> developers = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			developers.add(new Developer(A[i], B[i]));
		}

		Collections.sort(developers);
		Collections.reverse(developers);

		int Cmax = 0,  beCount = 0;

		for (Developer dev : developers) {

			if (beCount < (developers.size() - F) && dev.be >= dev.fe) {
				Cmax += dev.be;
				beCount++;
			} else {
				Cmax += dev.fe;
			}
		}

		return Cmax;
	}
}
