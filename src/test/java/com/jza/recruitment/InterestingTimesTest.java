package com.jza.recruitment;

import org.junit.Assert;
import org.junit.Test;

public class InterestingTimesTest {

	@Test
	public void test1() {
		String[] t1 = {"15:15:00", "15:15:12"};
		Assert.assertEquals(1, InterestingTimes.solution(t1[0], t1[1]));
	}

	@Test
	public void test2() {
		String[] t2 = {"22:22:21", "22:22:23"};
		Assert.assertEquals(3, InterestingTimes.solution(t2[0], t2[1]));
	}

	@Test
	public void test3() {
		String[] t3 = {"01:01:01", "22:01:02"};
		Assert.assertEquals(311, InterestingTimes.solution(t3[0], t3[1]));
	}

	@Test
	public void test4() {
		String[] t4 = {"13:31:33", "13:31:30"};
		Assert.assertEquals(0, InterestingTimes.solution(t4[0], t4[1]));
	}

	@Test
	public void test5() {
		String[] t5 = {"00:00:01", "23:59:59"};
		Assert.assertEquals(503, InterestingTimes.solution(t5[0], t5[1]));
	}

}
