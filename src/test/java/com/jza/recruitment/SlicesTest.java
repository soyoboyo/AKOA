package com.jza.recruitment;

import com.jza.recruitment.Slices;
import org.junit.Assert;
import org.junit.Test;

public class SlicesTest {

	@Test
	public void initialExamples() {
		int[] t1 = {1, 1, 2, 5, 7};
		int[] t2 = {-1, 1, 3, 3, 3, 2, 1, 0};
		int[] t3 = {1, 3, 5, 7, 9};
		int[] t4 = {7, 7, 7, 7};
		int[] t5 = {3, -1, -5, -9};
		int[] t6 = {-1, 0, 1, 2};
		Assert.assertEquals(0, Slices.slices(t1));
		Assert.assertEquals(5, Slices.slices(t2));
		Assert.assertEquals(6, Slices.slices(t3));
		Assert.assertEquals(3, Slices.slices(t4));
		Assert.assertEquals(3, Slices.slices(t5));
		Assert.assertEquals(3, Slices.slices(t6));
	}


}
