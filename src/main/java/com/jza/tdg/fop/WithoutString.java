package com.jza.tdg.fop;

class WithoutString {
	public static String withoutString(String original, String toRemove) {
		StringBuilder sb = new StringBuilder();
		String base = original.toLowerCase();
		String remove = toRemove.toLowerCase();
		for (int i = 0; i < base.length(); i++) {
			int j = 0;
//			base.length() - i - remove.length() >= 0
			while (j < remove.length()) {
				if (base.charAt(i) != remove.charAt(j)) {
					sb.append(original.charAt(i));
					break;
				} else if (j != remove.length() - 1) {
					i++;
				}
				j++;
			}

		}

		return sb.toString();
	}
}
