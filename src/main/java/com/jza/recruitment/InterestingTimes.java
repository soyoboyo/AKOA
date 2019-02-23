package com.jza.recruitment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class InterestingTimes {
	public static int solution(String S, String T) {
		int points = 0;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Date date1 = sdf.parse(S);
			Date date2 = sdf.parse(T);
			int timeDelta = (int) (date2.getTime() - date1.getTime()) / 1000;
			if (timeDelta < 0) {
				return 0;
			}

			String[] moments = new String[timeDelta + 1];
			for (int i = 0; i < moments.length; i++) {
				if (i == 0) {
					moments[0] = S;
				} else {
					Date d = new Date(sdf.parse(moments[0]).getTime() + ((i) * 1000));
					moments[i] = sdf.format(d);
				}
			}

			HashSet<Integer> set;
			for (int i = 0; i < moments.length; i++) {
				set = new HashSet<>();
				String moment = moments[i];
				String[] separated = moment.split(":");
				for (int j = 0; j < separated.length; j++) {
					String tmp = separated[j];
					char[] c = tmp.toCharArray();
					char c1 = c[0];
					char c2 = c[1];
					if (c1 == c2) {
						set.add((int) c1);
					} else {
						set.add((int) c1);
						set.add((int) c2);
					}
				}
				if (set.size() <= 2) {
					points++;
				}
			}
		} catch (ParseException ex) {
		}
		return points;
	}
}
