package com.jza.dip.uber;

class CapacityForRain {
	public static int getCapacity(int[] landscape) {
		if (landscape.length < 2) {
			return 0;
		}
		int capacity = 0;
		int potentialCapacity = 0;
		boolean isInGap = false;
		int leftEdge = landscape[0];
		int rightEdgeIndex = 0;
		int gapSize = 0;
		for (int i = 0; i < landscape.length; i++) {
			int current = landscape[i];
			if (current < leftEdge) {
				isInGap = true;
			}
			if (current >= leftEdge) {
				if (isInGap) {
					if (leftEdge > current) {
						capacity += (potentialCapacity - ((leftEdge - current) * gapSize));
					} else {
						capacity += potentialCapacity;
					}
					gapSize = 0;
					potentialCapacity = 0;
				} else {
					leftEdge = current;
				}
				isInGap = false;
			} else {
				if (isInGap) {
					rightEdgeIndex = current > landscape[rightEdgeIndex] && leftEdge > current ? i : rightEdgeIndex;
					potentialCapacity += leftEdge - current;
					gapSize++;
				} else {
					rightEdgeIndex = i;
					isInGap = true;
					leftEdge = current;
				}

				if (i == landscape.length - 1 && potentialCapacity > 0) {
					capacity += potentialCapacity - (leftEdge - landscape[rightEdgeIndex]) * gapSize;
					capacity -= removeExcess(rightEdgeIndex, leftEdge, landscape);
				}
			}


		}
		return capacity;
	}

	private static int removeExcess(int lastIndex, int leftEdge, int[] landscape) {
		int excess = 0;
		System.out.println("lastIndex = " + lastIndex);
		for (int i = lastIndex; i < landscape.length; i++) {
			excess += leftEdge - landscape[i];
			excess -= leftEdge - landscape[lastIndex];
		}
		System.out.println("excess = " + excess);
		return excess;
	}
}
