package com.jza.codewars.kyu6;

public class DeafRatsOfHamelin {

	public int countDeafRats(final String town) {
		String tightTown = town.replaceAll("\\s+", "");
		char[] chars = tightTown.toCharArray();
		int hamelingIndex = chars.length - 1;
		int deafMmice = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '~' && i > hamelingIndex) {
				deafMmice++;
			} else if (chars[i] == 'O' && i < hamelingIndex) {
				deafMmice++;
			} else if (chars[i] == 'P') {
				hamelingIndex = i;
				i--;
			}
			i++;
		}

		return deafMmice;
	}

}
