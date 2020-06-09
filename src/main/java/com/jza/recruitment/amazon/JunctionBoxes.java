package com.jza.recruitment.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JunctionBoxes {

	public static List<String> orderedJunctionBoxes(int numberOfBoxes, List<String> boxList) {

		List<String> olderGeneration = new ArrayList<>();
		List<String> newerGeneration = new ArrayList<>();
		Collections.sort(olderGeneration);

		newerGeneration.addAll(olderGeneration);


		return new ArrayList<>();
	}

}
