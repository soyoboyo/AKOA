package com.jza.pramp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrampAskedByMe {

	public static int getDifferentNumber(int[] arr) {

		/*
		int len = arr.length;
		Arrays.sort(arr);
		for(int i = 0; i < len; i++){
			if(i != arr[i]){
				return i;
			}
		}
		return len;
		*/

		/*
		import java.util.stream.Collectors;
		import java.util.stream.IntStream;

		int len = arr.length;
		Set<Integer> set = IntStream.of(arr).boxed().collect(Collectors.toSet());

		for(int i = 0; i < len; i++){
			if(set.contains(i) == false){
				return i;
			}
		}
		return len;
		 */
		int len = arr.length;
		int idx = 0;
		// put each number in its corresponding index, kicking out
		// the original number, until the target index is out of range.
		for (int i = 0; i < len; i++) {
			idx = arr[i];
			while (idx < len && arr[idx] != idx) {
				int tmp = idx;
				idx = arr[idx];
				arr[tmp] = tmp;
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("while end");
		}

		for (int i = 0; i < len; i++) {
			if (arr[i] != i) {
				return i;  // i isn’t in arr, hence we can return it
			}
		}
		// we got here since every number from 0 to n-1 is in arr.
		// By definition then, n isn’t in arr. Otherwise, the size of arr
		// would have been n+1 and not n.
		return len;
	}

	public static int[][] findPairsWithGivenDifference(int[] arr, int k) {
		List<Integer> hasMatchingNumber = new ArrayList<>();
		// create set from array
		Set<Integer> set = IntStream.of(arr).boxed().collect(Collectors.toSet());

		// iterate over array
		for (int y : arr) {
			int x = k + y;
			if (set.contains(x) && x != y) {
				hasMatchingNumber.add(y);
			}
		}

		int[][] result = new int[hasMatchingNumber.size()][2];
		for (int i = 0; i < hasMatchingNumber.size(); i++) {
			int y = hasMatchingNumber.get(i);
			result[i] = new int[]{k + y, y};
		}
		return result;
	}

//	static int[][] findPairsWithGivenDifference(int[] arr, int k) {
//		if(k==0) return new int[0][];
//		Set<Integer> st = new HashSet();
//		List<int[]> res = new ArrayList<>();
//		Map<Integer, Integer> mp = new HashMap();
//
//		//iterate the array from left to right
//		for(int i = 0; i<arr.length;i++)
//		{
//			mp.put(arr[i], i);
//			if(st.contains(arr[i]-k))
//			{
//				res.add(new int[]{arr[i], arr[i]-k});
//			}
//			if(st.contains(k+arr[i]))
//			{
//				res.add(new int[]{arr[i]+k, arr[i]});
//			}
//
//			st.add(arr[i]);
//		}
//
//		//sort
//		Collections.sort(res, (x1,x2)->( mp.get(x1[1])-mp.get(x2[1]) ) );
//
//		//process the output
//		int[][] f = new int[res.size()][2];
//		for(int i = 0 ; i <res.size();i++)
//		{
//			f[i] = res.get(i);
//		}
//		return f;
//	}

}
