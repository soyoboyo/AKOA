package com.jza.other.examplesForTests;

public class Main {
	public static void main(String[] args) {
		System.out.println(args[2]);
	}

	// Given this code, which command will output "2"?
	// java Main 1 "2" "3 4" 5
	// java Main 1 2 "3 4" 5
	// java Main 1 "2" "2" 5
	// java Main.class 1 "2" 2 5

}
