package com.jza.coderpro.done;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class CourseScheduleTest {

	private final static String c1 = "CSC100";
	private final static String c2 = "CSC200";
	private final static String c3 = "CSC300";

	@Test
	public void test1() {
		HashMap<String, List<String>> courses = new HashMap<String, List<String>>() {{
			put(c3, Arrays.asList(c1, c2));
			put(c2, Arrays.asList(c1));
			put(c1, Arrays.asList());
		}};
		Assertions.assertEquals(Arrays.asList(c1, c2, c3), CourseSchedule.getCoursesOrder(courses));
	}

	@Test
	public void test2() {
		HashMap<String, List<String>> courses = new HashMap<String, List<String>>() {{
			put(c2, Arrays.asList(c1));
			put(c1, Arrays.asList(c2));
		}};
		Assertions.assertEquals(null, CourseSchedule.getCoursesOrder(courses));
	}
}
