package com.jza.other;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class LinkedinSkillsTest {

	public static void q1() {
		// 7
		HashMap<String, Integer> pantry = new HashMap<>();
		pantry.put("Apples", 3);
		pantry.put("Oranges", 2);

		int currentApples = pantry.get("Apples");
		pantry.put("Apples", currentApples + 4);
		System.out.println(pantry.get("Apples"));

	}

	public static void q3() {
		// a negative number
		System.out.println("apple".compareTo("banana"));
	}

	public static void q5() {
		// a runtime exception is thrown
		String message = "Hello world!";
		String newMessage = message.substring(6, 12) + message.substring(12, 6);
		System.out.println(newMessage);
	}

	public static void q6() {
		List<String> list = Arrays.asList("Zed", "Ned", "Ded", "Ped");
		List<String> names = new ArrayList<>(list);
		Collections.sort(names);
		System.out.println(names.toString());

		names = new ArrayList<>(list);
		names.sort(Comparator.comparing(String::toString));
		System.out.println(names.toString());

		names = new ArrayList<>(list);
		names.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(names.toString());

		names = new ArrayList<>(list);
//		names.sort(List.DESCENDING);
//		System.out.println(names.toString());
	}

	public static void q7() {
		String s = "schwifty";
		System.out.println(s.getClass().getSimpleName() == "String");
//		System.out.println(s.getType() == String);
		System.out.println(s instanceof String);
//		System.out.println(s.getType().equals("String"));
	}

	public static void q9() {
		// A and D
		try {
			System.out.println("A");
			badMethod();
			System.out.println("B");
		} catch (Exception ex) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
	}

	private static void badMethod() {
		throw new Error();
	}

	public static void q10() {
		// runtime exception
		String message = "Hello";
		for (int i = 0; i < message.length(); i++) {
			System.out.println(message.charAt(i + 1));
		}
	}

	public static void q13() {
		System.out.println(Calendar.getInstance().getTime());
		System.out.println(LocalDate.now());
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		System.out.println(new Date(System.currentTimeMillis()));
	}

	public static void q14() {
		// should print "2"
		// java Main 1 "2" "2" 5 // output "2"
		// System.out.println(args[2]);

		//	java Main 1 "2" "3 4" 5 // output "3 4"
		//	java Main 1 2 "3 4" 5 // output "3 4"
// 		java Main 1 "2" "2" 5 // output "2"
		//	java Main.class 1 "2" 2 5 // output 2

	}

}
