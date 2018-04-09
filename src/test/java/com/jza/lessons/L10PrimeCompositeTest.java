package com.jza.lessons;

import org.junit.Assert;
import org.junit.Test;

public class L10PrimeCompositeTest {

	@Test
	public void initCountFactors(){
		Assert.assertEquals(8, L10PrimeComposite.countFactors(24));
		Assert.assertEquals(4, L10PrimeComposite.countFactors(10));
		Assert.assertEquals(2, L10PrimeComposite.countFactors(41));
		Assert.assertEquals(5, L10PrimeComposite.countFactors(16));
	}
	@Test
	public void initMinPermieterRectangle(){
		Assert.assertEquals(8, L10PrimeComposite.countFactors(24));
		Assert.assertEquals(4, L10PrimeComposite.countFactors(10));
		Assert.assertEquals(2, L10PrimeComposite.countFactors(41));
		Assert.assertEquals(5, L10PrimeComposite.countFactors(16));
	}
}
