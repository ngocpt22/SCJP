package com.ngoc.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String args[]) {
		String count[] = { "34", "22", "10", "60", "30", "22" };
		Set<String> set = new HashSet<String>();
		try {
			for (int i = 0; i < 5; i++) {
				set.add(count[i]);
			}
			
			for (String string : set) {
				System.out.println(string);
			}
			

			/*TreeSet sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is:");
			System.out.println(sortedSet);

			System.out.println("The First element of the set is: "
					+ (Integer) sortedSet.first());
			System.out.println("The last element of the set is: "
					+ (Integer) sortedSet.last());*/
		} catch (Exception e) {
		}
	}
}