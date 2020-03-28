package com.jza.tdg.fop;

public class InterpreterCalculator {

	public static int interpret(int value, String[] commands, int[] args) {
		int sum = value;
		for (int i = 0, j = 0; i < commands.length; i++, j++) {
			String c = commands[i];
			int arg = args[j];
			switch (c) {
				case "+":
					sum += arg;
					break;
				case "-":
					sum -= arg;
					break;
				case "*":
					sum *= arg;
					break;
				case "/":
					sum /= arg;
					break;
				default:
					return -1;
			}
		}

		return sum;
	}

}
