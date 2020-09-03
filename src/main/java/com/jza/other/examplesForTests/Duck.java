package com.jza.other.examplesForTests;

public class Duck {

	private String name;

	Duck(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println(new Duck("Moby"));
	}
	// What should you add to the Duck class so that the Duck's name, Moby, will be printed?

	// A
	public String toString() {
		return name;
	}

	// B
//	public void toString(){
//		System.out.println(this.name);
//	}

	// C
//	String toString(){
//		return this.name;
//	}

	// D
//	public void println(){
//		System.out.println(name);
//	}

}
