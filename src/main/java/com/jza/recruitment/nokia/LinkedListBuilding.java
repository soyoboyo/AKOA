package com.jza.recruitment.nokia;

public class LinkedListBuilding {

	public static int solution(int[] A) {
		int length = 1, index = 0;
		int value = A[0];
		while (value != -1) {
			index = value;
			if (value != -1) {
				value = A[index];
				length++;
			}
		}

		return length;
	}
}
