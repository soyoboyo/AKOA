package com.jza.other.examplesForTests;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class LinkedinSkillsTest {

	public static void main(String args[]) {

//		float b = 3.14;


//		char sm = 'x';
//		System.out.println((int) sm);
//		for(int x = 1; x <-10; x--){}
//		for(i = 3; i <= 3; i++){}
//		for(;;){}
//		for(int i; i == 2; i++){}


	}

	public static void m1() {
		// What will this program print out to the console when executed?
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(1);
		list.add(10);
		System.out.println(list);
		// [10, 5, 1]
		// [5, 1, 10]
		// [10, 1, 5]
		// [1, 5, 10]
	}

	public static void m2() {
//		int a = 123451234512345;
//		System.out.println(a);
		//	What is the output of this code?
		//	Nothing - this will not compile.
		//	"12345100000"
		//	a negative integer value
		//	"123451234512345"
	}

	public static void m3() {
		int x = 5, y = 10;
		swapsies(x, y);
		System.out.println(x + " " + y);
		// What does this code print?
		// 10 10
		// 5 10
		// 10 5
		// 5 5
	}

	static void swapsies(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void m4() {
		List list = new ArrayList();
		list.add("hello");
		list.add(2);
		System.out.println(list.get(0) instanceof Object);
		System.out.println(list.get(1) instanceof Integer);

		// What is the ouput of this code?
		// The code does not compile.
		// truetrue
		// truefalse
		// falsetrue
	}

	public static void m5() {
		int x = 5;
		x = 10;
		System.out.println(x);
		// What is displayed when the code below is compiled?
		// x
		// 5
		// 10
		// null
	}

	public static void m6() {
		List theList = new ArrayList();
		// Which is an INVALID way to iterate over List theList?
		// A
//		Iterator it = theList.iterator();
//		for(it.hasNext()){
//			System.out.println(it.next());
//		}

		// B
		for (Object object : theList) {
			System.out.println(object);
		}

		// C
		for (int i = 0; i < theList.size(); i++) {
			System.out.println(theList.get(i));
		}

		// D
		theList.forEach(System.out::println);

	}

	public static void m7() {
		List<Duck2> ducks = new ArrayList<>();
		// Add a Duck called "Waddles" to the ArrayList ducks.
		// A
//		Duck2 duck = new Duck2("Waddles");
//		ducks.add(waddles);
		// B
//		ducks.add(new Waddles());
		// C
		ducks.add(new Duck2("Waddles"));
		// D
//		Duck2 waddles = new Duck2();
//		ducks.add(waddles);

	}

	public static void m8() {
		// What is displayed when the following code is compiled and executed?
		HashMap<String, Integer> pantry = new HashMap<>();

		pantry.put("Apples", 3);
		pantry.put("Oranges", 2);

		int currentApples = pantry.get("Apples");
		pantry.put("Apples", currentApples + 4);

		System.out.println(pantry.get("Apples"));
		// 6
		// 3
		// 4
		// 7
	}

	public static void m9() {
		// What is the result of this code?
		int a = 1;
		int b = 0;
		int c = a / b;
		System.out.println(c);

		// It will run and output infinity.
		// It will throw an ArithmeticException. <-
		// It will run and output 0.
		// It will not compile because of line 3.
	}

	public static void m10() {
		int array[] = {1, 2, 3, 4};
//		for (int i = 0; i < array.size(); i++) {
//			System.out.println(array[i]);
//		}
		// What is the output of this code?
		// It will not compile because of line 3.
		// It will not compile because of line 4.
		// 1234
		// 123
	}

	public static void m11() {
		for (int i = 0; i < 10; i++) {
			i += 1;
			System.out.println("Hello World!");
		}
		// How many times will this code print "Hello World"?
		// infinite number of times
		// 10 times
		// 5 times
		// 9 times
	}

	public static void m12() {
		String message = "Hello";
		for (int i = 0; i < message.length(); i++) {
			System.out.println(message.charAt(i + 1));
		}
		// What is the output of this code?
		// "Hello"
		// "ello"
		// The code does not compile
		// A runtime exception <-
	}

	public static void m13() {
		List sparkles = new ArrayList();
		nullify(sparkles);
		System.out.println(sparkles.get(0));
		// What is the result of this code?
		// 0
		// null
		// NullPointerException
		// IndexOutOfBoundsException
	}

	static void nullify(List list) {
		list = null;
	}

	public static void m14() {
//		try {
//			System.out.println("Hello World");
//		} catch (Exception e){
//			System.out.println("e");
//		} catch (ArithmeticException e){
//			System.out.println("e");
//		} finally{
//			System.out.println("!");
//		}

		// What is the result of this code?
		// It will not compile.
		// Hello World
		// Hello World!
		// It will throw a runtime exception.
	}

	public static void m15() {
		JButton groucyButton = new JButton("Do Something");
		// Refactor this event handler to a lambda expression:

		groucyButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Press me one more time...");
			}
		});

		// A
//		groucyButton.addActionListener(() -> System.out.println("Press me one more time..."));

		// B
//		groucyButton.addActionListener(ActionListener listener -> System.out.println("Press me one more time..."));

		// C
//		groucyButton.addActionListener(new ActionListener(ActionEvent e) {
//			() -> System.out.println("Press me one more time...");
//		});

		// D
		groucyButton.addActionListener((event) -> System.out.println("Press me one more time..."));
	}

	public static void m16() {
		System.out.println(print(1));
		// What is the result of this code?
		// It will show a stack trace with a runtime exception.
		// It will run and throw an exception.
		// It will not compile.
		// "java.lang.Exception"
	}

	static Exception print(int i) {
		if (i > 0) {
			return new Exception();
		} else {
			throw new RuntimeException();
		}
	}

	public static void m17() {
		String message = "Hello";
		print(message);
		message += "World!";
		print(message);
	}

	static void print(String message) {
		System.out.println(message);
		message += " ";
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
		/*
		"world!world!"
		"world!!world!"
		The code does not compile
		A runtime exception is thrown
		 */
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
		// which letters will print when this code is run?
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
		// A and D
		// C and D
		// A, C and D
		// A, B and D
	}

	private static void badMethod() {
		throw new Error();
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
