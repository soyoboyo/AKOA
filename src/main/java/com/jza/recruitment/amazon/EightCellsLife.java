package com.jza.recruitment.amazon;

import java.util.Arrays;

class EightCellsLife {
	public static int[] solution(int[] cells, int days) {
		int length = cells.length;
		int[] newCells = new int[length];
		for (int day = 0; day < days; day++) {
			for (int i = 1; i < length - 1; i++) {
				int leftCell = cells[i - 1];
				int rightCell = cells[i + 1];
				newCells[i] = getState(leftCell, rightCell);
			}
			newCells[0] = getState(0, cells[1]);
			newCells[length - 1] = getState(cells[length - 2], 0);
			cells = Arrays.copyOf(newCells, length);
		}
		return cells;
	}

	private static int getState(int left, int right) {
		if (left == right) {
			return 0;
		}
		return 1;
	}

}
