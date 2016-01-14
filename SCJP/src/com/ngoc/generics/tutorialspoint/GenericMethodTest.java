package com.ngoc.generics.tutorialspoint;

public class GenericMethodTest {
	
	/**
	 * a type parameter section delimited by angle brackets (< and >) that precedes the method's return type (eg: <E> below)
	 * generic method printArray
	 */
	public static <E> void printArray(E[] inputArray) {
		for (E e : inputArray) {
			System.out.printf("%s ", e);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("=======STRINGS=======");
		String[] strings = { "N", "Q", "T", "K", "C" };
		printArray(strings);
		System.out.println("=======INTEGERS=======");
		Integer[] ints = { 14, 12, 54, 12, 13 };
		printArray(ints);
		System.out.println("=======CHARACTER=======");
		Character[] chars = { 'N', 'G', 'O', 'C' };
		printArray(chars);
	}
}
