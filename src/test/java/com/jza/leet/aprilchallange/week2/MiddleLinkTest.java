package com.jza.leet.aprilchallange.week2;

import com.jza.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleLinkTest {
	@Test
	public void test1() {
		ListNode input = new ListNode(1);
		input.next = new ListNode(2);
		input.next.next = new ListNode(3);
		input.next.next.next = new ListNode(4);
		input.next.next.next.next = new ListNode(5);
		ListNode expected = input.next.next;
		assertEquals(expected.val, MiddleLink.middleNode(input).val);
	}

	@Test
	public void test2() {
		ListNode input = new ListNode(1);
		input.next = new ListNode(2);
		input.next.next = new ListNode(3);
		input.next.next.next = new ListNode(4);
		input.next.next.next.next = new ListNode(5);
		input.next.next.next.next.next = new ListNode(6);
		ListNode expected = input.next.next.next;
		assertEquals(expected.val, MiddleLink.middleNode(input).val);
	}
}
