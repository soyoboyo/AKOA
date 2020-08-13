package com.jza.other;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;


public class HackAttemptDiscovery {

	private static final String LOG_FILE = "src\\main\\java\\com\\jza\\other\\dynatrace_example.log";
	private static final Set<String> validIPs = new HashSet<>(Arrays.asList("57.48.9.100", "2.21.107.254", "130.25.179.252"));

	public static String solve1() {
		Map<String, Integer> ips = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(" ", 3);
				String ip = parts[1].substring(9);
				if (validIPs.contains(ip)) {
					ips.compute(ip, (k, v) -> v == null ? 1 : v + 1);
				}
			}
		} catch (IOException e) {
			throw new IllegalStateException("File not found.");
		}
		return sortByValue(ips).toString();
	}

	public static List<String> solve2() {
		Map<String, Integer> ips = new LinkedHashMap<>();
		ips.put("57.48.9.100", 0);
		ips.put("2.21.107.254", 0);
		ips.put("130.25.179.252", 0);
		String successfulLogin = "requestUrl=/dynatrace.com/login statusCode=200";
		try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(" ", 3);
				String ip = parts[1].substring(9);
				if (validIPs.contains(ip) && line.contains(successfulLogin)) {
					ips.put(ip, ips.get(ip) + 1);
				}
			}
		} catch (IOException e) {
			throw new IllegalStateException("File not found.");
		}
		List<String> result = new ArrayList<>();
		String filler = " successful logins from that ";
		for (Map.Entry<String, Integer> entry : ips.entrySet()) {
			result.add(entry.getValue() + filler + entry.getKey());
		}
		return result;
	}

	public static int solve3() {
		int counter = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {
			String line;
			while ((line = reader.readLine()) != null) {
				boolean hasToken = Pattern.compile("[a-z0-9]{5}:[a-z0-9]{3}:[a-z0-9]{5}").matcher(line).find();
				if (hasToken) {
					counter++;
				}
			}
		} catch (IOException e) {
			throw new IllegalStateException("File not found.");
		}
		return counter;
	}

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());
		Collections.reverse(list);
		Map<K, V> result = new LinkedHashMap<>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}

		return result;
	}


}
