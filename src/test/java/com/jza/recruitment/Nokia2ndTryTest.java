package com.jza.recruitment;

import com.jza.current.Nokia2ndTry;
import org.junit.Assert;
import org.junit.Test;

public class Nokia2ndTryTest {

	@Test
	public void removeSortTest() {
		String t1 = "banana";
		String t2 = "anal";
		String t3 = "zyx";
		String t4 = "aaababa";


		Assert.assertEquals(3, Nokia2ndTry.removeSort(t1));
		Assert.assertEquals(1, Nokia2ndTry.removeSort(t2));
		Assert.assertEquals(2, Nokia2ndTry.removeSort(t3));
		Assert.assertEquals(2, Nokia2ndTry.removeSort(t4));

	}

	@Test
	public void interestingTimesTest() {
		String[] t1 = {"15:15:00", "15:15:12"};
		String[] t2 = {"22:22:21", "22:22:23"};
		String[] t3 = {"01:01:01", "22:01:02"};
		String[] t4 = {"13:31:33", "13:31:30"};
		String[] t5 = {"00:00:01", "23:59:59"};

		Assert.assertEquals(1, Nokia2ndTry.interestingTimes(t1[0], t1[1]));
		Assert.assertEquals(3, Nokia2ndTry.interestingTimes(t2[0], t2[1]));
		Assert.assertEquals(311, Nokia2ndTry.interestingTimes(t3[0], t3[1]));
		Assert.assertEquals(0, Nokia2ndTry.interestingTimes(t4[0], t4[1]));
		Assert.assertEquals(503, Nokia2ndTry.interestingTimes(t5[0], t5[1]));
	}

}
