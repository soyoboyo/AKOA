package com.jza.tdg.fop;

class WithoutString {
	public static String withoutString(String original, String toRemove) {
		StringBuilder sb = new StringBuilder();
		String base = original.toLowerCase();
		String remove = toRemove.toLowerCase();
		for (int i = 0; i < base.length(); i++) {
			int j = 0;

			String temp = "";
			while (j < remove.length() && i < base.length()) {
				if (base.charAt(i) != remove.charAt(j) && temp.length() == 0) {
					sb.append(original.charAt(i));
					break;
				} else {
					temp += original.charAt(i);
					j++;
					i++;
				}
			}
			if (!temp.toLowerCase().equals(remove)) {
				sb.append(temp);
			}
			if (temp.length() > 0) {
				i--;
			}
		}
		return sb.toString();
	}
}
