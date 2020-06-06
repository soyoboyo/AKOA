package com.jza.recruitment.amazon;

class EightCellsLife {

	public static int[] cellCompete(int[] states, int days) {
		while (days-- > 0) {
			int ceil = getState(0, states[1]);
			int nextCeil;
			for (int i = 1; i < states.length - 1; i++) {
				nextCeil = getState(states[i - 1], states[i + 1]);
				states[i - 1] = ceil;
				ceil = nextCeil;
			}
			int newCeil = getState(states[states.length - 2], 0);
			states[states.length - 2] = ceil;
			states[states.length - 1] = newCeil;
		}
		return states;
//		return Arrays.stream(states).boxed().collect(Collectors.toList());
	}

	private static int getState(int left, int right) {
		return left == right ? 0 : 1;
	}


}
