package com.jza.leet.aprilchallange.week2;

import com.jza.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

class MiddleLink {

	public static ListNode middleNode(ListNode head) {
		List<ListNode> list = new ArrayList<>();
		ListNode n = head;
		list.add(n);
		while (n.next != null) {
			list.add(n);
			n = n.next;
		}

		if (list.size() % 2 == 0) {
			return list.get(list.size() / 2).next;
		}
		return list.get((list.size() + 1) / 2);
	}
}
