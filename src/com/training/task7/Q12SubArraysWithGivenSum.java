package com.training.task7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q12SubArraysWithGivenSum {

		public static void main (String[] args)
		{
			int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
			int sum = 7;
			printallSubarrays(arr, sum);
		}
		
		public static void printallSubarrays(int[] A, int sum)
		{
			Map<Integer, List<Integer>> hashMap = new HashMap<>();
			insert(hashMap, 0, -1);

			int sum_so_far = 0;

			for (int index = 0; index < A.length; index++)
			{
				sum_so_far += A[index];
				if (hashMap.containsKey(sum_so_far - sum))
				{
					List<Integer> list = hashMap.get(sum_so_far - sum);
					for (Integer value: list) {
						printSubarray(A, value + 1, index);
					}
				}
				insert(hashMap, sum_so_far, index);
			}
		}
		
		public static void printSubarray(int[] A, int i, int j)
		{
			System.out.println(IntStream.range(i, j + 1)
										.mapToObj(k -> A[k])
										.collect(Collectors.toList()));
		}

		private static<K,V> void insert(Map<K, List<V>> hashMap, K key, V value)
		{
			// if the key is seen for the first time, initialize the list
			if (!hashMap.containsKey(key)) {
				hashMap.put(key, new ArrayList<>());
			}

			hashMap.get(key).add(value);
		}
}
