package com.jza.leet.aprilchallange;

import java.util.*;

public class GroupAnagrams {

	static class Pair {
		public String key;
		public String value;

		public Pair(String key, String value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Pair{" +
					"key='" + key + '\'' +
					", value='" + value + '\'' +
					'}';
		}
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, String> m = new LinkedHashMap<>();
		List<Pair> list = new ArrayList<>();
		for (String s : strs) {
			SortedMap<String, Integer> sMap = new TreeMap<>();
			if (s.length() == 0) {
				sMap.put("", 1);
			}
			for (int i = 0; i < s.length(); i++) {
				sMap.merge(s.substring(i, i + 1), 1, Integer::sum);
			}
			list.add(new Pair(s, sMap.toString()));
		}
		Map<String, List<String>> aggregated = new LinkedHashMap<>();
		for (Pair p : list) {
			String v = p.value;
			String k = p.key;
			if (!aggregated.containsKey(v)) {
				aggregated.put(v, new ArrayList<>(Arrays.asList(k)));
			} else {
				aggregated.get(v).add(k);
			}
		}
		List<List<String>> result = new ArrayList<>();
		aggregated.forEach((k, v) -> {
			result.add(v);
		});
		return result;
	}
}


/*

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,Integer> map=new HashMap();
       List<List<String>> res=new ArrayList();
        int k=0;
       for(int i=0;i<strs.length;i++){
           char[] tmp=strs[i].toCharArray();
           Arrays.sort(tmp);
           String tmp1=new String(tmp);

           if(map.get(tmp1)!=null){
               int n=map.get(tmp1.toString());
               List<String> l=res.get(n);
               l.add(strs[i]);
               res.set(n,l);
           }
           else{
               map.put(tmp1,new Integer(k));
               k=k+1;
               List<String> templ=new ArrayList();
               templ.add(strs[i]);
               res.add(templ);

           }
       }
        return res;
    }
}
 */
