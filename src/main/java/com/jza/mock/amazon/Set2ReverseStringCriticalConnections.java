package com.jza.mock.amazon;

public class Set2ReverseStringCriticalConnections {

	// question 1
	/*
		Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the 		string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k 		characters, then reverse the first k characters and left the other as original.

		Example:

		Input: s = "abcdefg", k = 2
		Output: "bacdfeg"

		Restrictions:

		The string consists of lower English letters only.
		Length of the given string and k will in the range [1, 10000]

	 */
	public static String reverseStr(String s, int k) {
		String result = "";
		int len = s.length();
		if (k > len) {
			return reverse(s);
		}
		result += reverse(s.substring(0, k));
		if (len >= 2 * k) {
			result += s.substring(k, 2 * k);
		} else {
			result += s.substring(k, len);
			return result;
		}
		int left = len - 2 * k;
		System.out.println(left);

		if (left < k) {
			result += reverse(s.substring(2 * k, len));
		} else if (k <= left && left < 2 * k) {
			result += reverse(s.substring(2 * k, 3 * k));
			result += s.substring(3 * k, len);
		} else {
			result += s.substring(2 * k, len);
		}

		return result;
	}

	public static String reverse(String input) {

		if (input == null) {
			return input;
		}

		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}

		return output;
	}

	/*
		There are n servers numbered from 0 to n-1 connected by undirected server-to-server connections forming a network where 		connections[i] = [a, b] represents a connection between servers a and b. Any server can reach any other server directly or 		indirectly through the network.

		A critical connection is a connection that, if removed, will make some server unable to reach some other server.

		Return all critical connections in the network in any order.

		Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
		Output: [[1,3]]
		Explanation: [[3,1]] is also accepted.
	 */


}
