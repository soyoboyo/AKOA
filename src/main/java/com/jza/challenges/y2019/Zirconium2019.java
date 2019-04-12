package com.jza.challenges.y2019;

import java.util.*;

public class Zirconium2019 {

	// https://app.codility.com/programmers/custom_challenge/zirconium2019/

	public class Developer implements Comparable<Developer> {
		int fe;
		int be;
		int delta;

		public Developer(int fe, int be) {
			this.fe = fe;
			this.be = be;
			this.delta = this.fe - this.be;
		}

		@Override
		public int compareTo(Developer o) {
			return Integer.compare(this.delta, o.delta);
		}

		@Override
		public String toString() {
			return "Developer{" +
					"fe=" + fe +
					", be=" + be +
					", delta=" + delta +
					'}';
		}
	}

	public int maxContribution(int[] A, int[] B, int F) {

		List<Developer> developers = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			developers.add(new Developer(A[i], B[i]));
		}

		Collections.sort(developers);

		int Cmax = 0, beCount = 0, feCount = 0;

		for (Developer dev : developers) {
			if (dev.be >= dev.fe) {
				if (beCount < (developers.size() - F)) {
					beCount++;
					Cmax += dev.be;
				} else {
					feCount++;
					Cmax += dev.fe;
				}
			} else {
				if (feCount < F) {
					feCount++;
					Cmax += dev.fe;
				} else {
					beCount++;
					Cmax += dev.be;
				}
			}
		}

		return Cmax;
	}
}
