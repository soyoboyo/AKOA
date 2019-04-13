package com.jza.challenges.y2019;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Zirconium2019v2 {
	public static int maxContribution(int[] A, int[] B, int F) {
		int size = B.length;
		int feCount = 0, feMax = F;
		int beCount = 0, beMax = size - F;
		int Cmax = 0;

		TreeSet<Developer> sortedContribution = new TreeSet<>(new QueueComparator());
		for (int i = 0; i < size; i++) {
			sortedContribution.add(new Developer(A[i], B[i]));
		}

		LinkedList<Developer> myList = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			Developer developer = sortedContribution.pollFirst();
			if (developer.difference < 0 && feCount < F) {
				feCount++;
				Cmax += developer.fe;
			} else if (developer.difference > 0 && beCount < beMax) {
				beCount++;
				Cmax += developer.be;
			} else {
				myList.addLast(developer);
			}
		}
		if (beCount != beMax) {
			for (int i = 0; i < beMax - beCount; i++) {
				Cmax += myList.pollFirst().be;
			}
		}
		if (feCount != F) {
			for (int i = 0; i < F - feCount; i++) {
				Cmax += myList.pollFirst().fe;
			}
		}
		return Cmax;
	}
}

class Developer {
	int fe;
	int be;
	int difference;

	public Developer(int fe, int be) {
		this.fe = fe;
		this.be = be;
		difference = this.be - this.fe;
	}
}

class QueueComparator implements Comparator<Developer> {
	@Override
	public int compare(Developer o1, Developer o2) {
		int mod = Math.abs(o1.difference) - Math.abs(o2.difference);
		if (mod > 0) {
			return -1;
		} else if (mod == 0 && (o1.fe > o2.be && o1.fe > o2.fe)) {
			return -1;
		}
		return 1;
	}
}
