package com.jza.dip.microsoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> mergedIntervals = new ArrayList<>();
		Collections.sort(intervals, Comparator.comparing(Interval::getStart));
		mergedIntervals.add(intervals.get(0));
		for (Interval i : intervals) {
			Interval last = mergedIntervals.get(mergedIntervals.size() - 1);
			if (last.start <= i.start && last.end >= i.start) {
				last.end = Math.max(i.end, last.end);
			} else {
				mergedIntervals.add(i);
			}
		}
		return mergedIntervals;
	}

	public static class Interval {
		public int start;
		public int end;

		public int getStart() {
			return start;
		}

		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public String toString() {
			return "start=" + start + ", end=" + end;
		}
	}

}
