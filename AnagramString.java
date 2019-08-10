package com.esraturkan.anagramstringarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramString {

	public static List<Integer>  isAnagram(List<String> words1, List<String> words2) {

		int j = 0;

		List<Integer> resultValues=new ArrayList<>();
		
		for (String word1 : words1) {

			int k=0;//degismesi gereken harf sayisi...
			
			String word2 = words2.get(j);

			char[] word1Array = word1.toCharArray();

			char[] word2Array = word2.toCharArray();

			Arrays.sort(word1Array);
			Arrays.sort(word2Array);

			if (word1Array.length == word2Array.length) {

				int i = 0;
				for (char c : word2Array) {

					if (c != word1Array[i]) {

					   k=k+1;
						
					}

					i++;

				}
			} else {
				k=-1;

			//	System.out.println("string uzunluklarý farklý..");
			}
			j++;
			
			
			resultValues.add(k);
		}
		
		return resultValues;

	}

}
