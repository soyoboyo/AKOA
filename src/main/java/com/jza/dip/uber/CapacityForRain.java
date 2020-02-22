package com.jza.dip.uber;

class CapacityForRain {
	public static int getCapacity(int[] landscape) {
		if (landscape.length < 2) {
			return 0;
		}
		int capacity = 0;
		int potentialCapacity = 0;
		boolean isInGap = landscape[1] < landscape[0];
		int leftEdge = isInGap ? landscape[0] : landscape[1];
		int gapSize = 0;
		for (int i = 1; i < landscape.length; i++) {
			int current = landscape[i];
			if (isInGap) {
				if (current >= leftEdge) {
					leftEdge = current;
					isInGap = false;
				} else {
					potentialCapacity += leftEdge - current;
					gapSize++;
				}
			} else {
				if (current >= leftEdge) {
					capacity += (potentialCapacity - (Math.min(current, leftEdge) * gapSize));
					gapSize = 0;
					potentialCapacity = 0;
				} else {
					isInGap = true;
				}
				leftEdge = current;
			}


//			if (current >= leftEdge && !isInGap) {
//				leftEdge = current;
//				gapCount = 0;
//			} else if (current < leftEdge && i != landscape.length - 1) {
//				isInGap = true;
//				potentialCapacity += leftEdge - current;
//				gapCount++;
//				System.out.println(gapCount);
//			} else if (isInGap) {
//				System.out.println(current + "  " + leftEdge);
//				if (current < leftEdge) {
//					capacity += (potentialCapacity - Math.min(current, leftEdge) * gapCount);
//				} else if (current > leftEdge) {
//					capacity += (potentialCapacity - Math.min(current, leftEdge) * (gapCount-1));
//				} else {
//					capacity += potentialCapacity;
//				}
//				gapCount = 0;
//				leftEdge = current;
//				isInGap = false;
//			}
		}
		return capacity;
	}
}
