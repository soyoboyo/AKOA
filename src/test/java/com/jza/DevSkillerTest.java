package com.jza;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;


class DevSkillerTest {

	@Test
	public void shouldReturnListWithRepeatedValues() {
//		// given
		DevSkiller exercise = new DevSkiller();

//		// when
		List<Integer> result = exercise.findDuplicates(asList(-1, 1, 3, 2, 5, 6, -1, 3, 6), 2);
		System.out.println(result);
//
//		// then
		assertThat(asList(-1, 3, 6), containsInAnyOrder(result.toArray()));
	}

	@Test
	public void nullValuesShouldBeOmitted() {
		// given
		DevSkiller exercise = new DevSkiller();

		// when
		List<Integer> result = exercise.findDuplicates(asList(1, 1, null, 2, 5, 6, 1, 3, 6, null), 2);

		// then
		assertEquals(singletonList(6), result);
	}

}
