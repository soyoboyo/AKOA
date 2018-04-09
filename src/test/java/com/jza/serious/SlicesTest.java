package com.jza.serious;

import com.jza.serious.Slices;
import org.junit.Assert;
import org.junit.Test;

public class SlicesTest {

	@Test
	public void initialExamples() {
		int[] a = {1, 1, 2, 5, 7};
		int[] b = {-1, 1, 3, 3, 3, 2, 1, 0};
		int[] c = {1,3,5,7,9};
		int[] d = {7, 7, 7, 7};
		int[] e = {3, -1, -5, -9};
		int[] f = {-1, 0, 1, 2};
		Assert.assertEquals(0, Slices.slices(a));
		Assert.assertEquals(5, Slices.slices(b));
		Assert.assertEquals(6, Slices.slices(c));
		Assert.assertEquals(3, Slices.slices(d));
		Assert.assertEquals(3, Slices.slices(e));
//		Assert.assertEquals(3, Slices.slices(f));
	}


}
