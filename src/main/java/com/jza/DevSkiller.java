package com.jza;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class DevSkiller {

	public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {
		Map<Integer, Integer> counts2 = integers.stream()
				.filter(Objects::nonNull)
				.collect(Collectors.groupingBy(i -> i,
						LinkedHashMap::new,
						Collectors.summingInt(j -> 1)));
		return counts2.entrySet().stream()
				.filter(entry -> entry.getValue() == numberOfDuplicates)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}
//		for (Integer value : integers) {
//			if(value != null){
//				if(counts.containsKey(value)){
//					counts.put(value, counts.get(value) + 1);
//				} else {
//					counts.put(value, 1);
//				}
//				counts.compute(value, (k, v) -> v == null ? 1 : v + 1);
//			}
//		}
//		List<Integer> result = new ArrayList<>();
//		for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
//			if(entry.getValue() == numberOfDuplicates){
//				result.add(entry.getKey());
//			}
//		}
//		return result;

}
