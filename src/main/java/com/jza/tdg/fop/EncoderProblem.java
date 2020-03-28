package com.jza.tdg.fop;

import java.util.HashMap;
import java.util.Map;

class EncoderProblem {
	public static String[] encoder(String[] raw, String[] code_words) {
		String[] encoded = new String[raw.length];
		Map<String, String> codes = new HashMap<>();
		int codeCounter = 0;
		for (int i = 0; i < raw.length; i++) {
			String r = raw[i];
			String val;
			if (codes.get(r) == null) {
				val = code_words[codeCounter];
				codes.put(r, val);
				codeCounter++;
			} else {
				val = codes.get(r);
			}
			encoded[i] = val;
		}
		return encoded;
	}

}
