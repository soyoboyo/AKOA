package com.jza.coderpro.done;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class CourseSchedule {

	public static List<String> getCoursesOrder(Map<String, List<String>> courses) {
		List<String> order = new ArrayList<>();
		List<String> toRemove = new ArrayList<>();
		while (!courses.isEmpty()) {
			AtomicBoolean isLooped = new AtomicBoolean(true);
			courses.forEach((k, v) -> {
				toRemove.clear();
				if (v.isEmpty()) {
					order.add(k);
					toRemove.add(k);
					isLooped.set(false);
				}
			});
			if (isLooped.get()) {
				return null;
			}
			removeCourse(courses, toRemove);
		}
		return order;
	}

	private static void removeCourse(Map<String, List<String>> courses, List<String> toRemove) {
		toRemove.forEach(courses::remove);
		toRemove.forEach(c -> {
			courses.forEach((k, v) -> {
				List<String> vals = new ArrayList<>(v);
				vals.remove(c);
				courses.put(k, vals);
			});
		});
	}

}
