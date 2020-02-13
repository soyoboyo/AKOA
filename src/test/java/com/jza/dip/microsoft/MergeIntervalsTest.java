package com.jza.dip.microsoft;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeIntervalsTest {

	@Test
	public void test1() {
		List<MergeIntervals.Interval> input = new ArrayList<MergeIntervals.Interval>() {{
			add(new MergeIntervals.Interval(1, 3));
			add(new MergeIntervals.Interval(5, 8));
			add(new MergeIntervals.Interval(4, 10));
			add(new MergeIntervals.Interval(20, 25));
		}};
		List<MergeIntervals.Interval> expected = new ArrayList<MergeIntervals.Interval>() {{
			add(new MergeIntervals.Interval(1, 3));
			add(new MergeIntervals.Interval(4, 10));
			add(new MergeIntervals.Interval(20, 25));
		}};

		assertEquals(expected.toString(), MergeIntervals.merge(input).toString());
	}


}
