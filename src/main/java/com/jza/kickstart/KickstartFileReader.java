package com.jza.kickstart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KickstartFileReader {

	public static BufferedReader readInput() throws IOException {
		return new BufferedReader(new InputStreamReader(System.in));
	}

}
