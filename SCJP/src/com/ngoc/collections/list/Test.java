package com.ngoc.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		System.out.println(strings.size());
		strings.add("N");
		strings.add("Q");
		strings.add("N");
		System.out.println(strings + ": " + strings.size());
		// sorting collections
		Collections.sort(strings);
		System.out.println(strings);
		strings.remove("N");
		System.out.println(strings + ": " + strings.size());
		System.out.println(strings + ": " + strings.contains(24));
		strings.removeAll(strings);
		System.out.println(strings + ": " + strings.size());

	}
}