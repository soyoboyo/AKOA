package com.jza.challenges.eygds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EYGDSChallengeTest {

	@Test
	public void test1Rearrange() {
		assertEquals(43322, EasyTasks.rearrange(23423));
	}

	@Test
	public void test2Rearrange() {
		assertEquals(99211, EasyTasks.rearrange(12991));
	}

	@Test
	public void test1OrganizeWork() {
		int[] arr = {2, 1, 3, 2, 3, 1};
		assertEquals(4, EasyTasks.organizeWork(3, arr));
	}

	@Test
	public void test2OrganizeWork() {
		int[] arr = {2, 1, 3, 2, 3, 1};
		assertEquals(12, EasyTasks.organizeWork(1, arr));
	}

	@Test
	public void test1IsEgoistic() {
		assertEquals(true, EasyTasks.isEgoistic("25"));
	}

	@Test
	public void test2IsEgoistic() {
		assertEquals(false, EasyTasks.isEgoistic("78678678761838187864181746846748138748748984364333"));
	}

	@Test
	public void testHeroesBattle() {
//		Wizard wizard = new Wizard("Shirius", 100, 20);
//		Knight knight = new Knight("Rolf the Hawk", 200, 50);
//		assertEquals("Shirius", wizard.GetName());
//		assertEquals(100, wizard.GetHealth());
//		assertEquals(20, wizard.GetDamage());
//		assertTrue(wizard.GetAliveStatus());
//		assertTrue(Arrays.equals(wizard.GetSpellBook(), new String[0]));
	}


}
