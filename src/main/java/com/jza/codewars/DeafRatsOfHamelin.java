package com.jza.codewars;

import java.util.ArrayList;
import java.util.List;

public class DeafRatsOfHamelin {

	public  int countDeafRats(final String town) {
		String tightTown = town.replaceAll("\\s+", "");
		char [] chars = tightTown.toCharArray();
		List<Character> mice = new ArrayList<>();
		int hamelingIndex = 0;
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] == '~'){
				mice.add('R');
				i++;
			} else if(chars[i] == 'O'){
				mice.add('L');
				i++;
			} else if (chars[i] == 'P'){
				mice.add('P');
				hamelingIndex = i/2;
			}
		}
		System.out.println(mice);

		int deafMmice = 0;
		for (int i = 0; i < mice.size(); i++) {
			Character mouse  = mice.get(i);
			if(i < hamelingIndex && mouse == 'L'){
				deafMmice++;
			} else if(i > hamelingIndex && mouse == 'R'){
				deafMmice++;
			}
		}

		return deafMmice;
	}

}
